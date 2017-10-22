package DynamicProgrammin;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class sherlock {
	

	    public static void main(String args[] ) throws Exception {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
	        
	        Scanner sc = new Scanner(System.in);
	        int t = sc.nextInt();
	        for(int it=0;it<t;it++){
	            int n = sc.nextInt();
	            int a[]= new int[n];
	             long l[]= new long[n];
	             long h[]= new long[n];
	            for(int i =0;i<n;i++){
	                a[i] = sc.nextInt();
	            }
	            long lo =0, hi = 0;
	            l[0]=0;
	            h[0]=0;
	            for(int i =1;i<n;i++){
	                l[i] = max(l[i-1],h[i-1] + a[i-1] -1);
	                h[i] = max(l[i-1] + a[i]-1, h[i] + abs(a[i] -a[i-1]) );
	                lo = max(lo,l[i]);
	                hi = max(hi,h[i]);
	            }
	            System.out.println(max(lo,hi));
	          
	        }
	    }
	        
	        public static long max(long a,long b){
	            if(a>b)
	                return a;
	            else
	                return b;
	        }
	
	        public static long abs(long a) {
	        	if(a<0)
	        		return -1*a;
	        	else
	        		return a;
	        }

}
