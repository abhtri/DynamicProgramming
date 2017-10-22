package DynamicProgrammin;

import java.util.Scanner;

public class InterestingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
	        int p = s.nextInt();
	        Long l = s.nextLong();
	        Long r = s.nextLong();
	        int z = s.nextInt();
	        int a[]=new int[10];
	        int b[]=new int[10];
	        for(int i=0;i<z;i++) {
	        	a[s.nextInt()]=1;
	        }
	        
	        long q= l/p;
	        long sum =0;
	        long rem = l%p;
	        if(rem==0) {
	        	sum=1;
	        }
	        while(p*(q+1)<=r) {
	        	q++;
	        	long e =p*q;
	        	while(e>0) {
	        		if(a[(int)(e%10)]!=1)
	        			break;
	        		e = e/10;
	        	}
	        	if(e==0)
	        		sum++;
	        	
	        }
	        System.out.println(sum);
	}

}
