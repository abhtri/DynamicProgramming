package DynamicProgrammin;

import java.util.Arrays;
import java.util.Scanner;

public class coinChange {
	
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	     int n = s.nextInt();
	     int m
	     = s.nextInt();
	     int a[]=new int[m];
	     for(int i =0;i<m;i++) {
	    	 a[i]=s.nextInt();
	     }
	     System.out.println(getSum(a,m,n));
	}
	public static long getSum(int[] S,int m,int n) {
		/*  long[] table = new long[n+1];
		  
	        // Initialize all table values as 0
	        Arrays.fill(table, 0);   //O(n)
	 
	        // Base case (If given value is 0)
	        table[0] = 1;
	 
	        // Pick all coins one by one and update the table[]
	        // values after the index greater than or equal to
	        // the value of the picked coin
	        for (int i=0; i<m; i++)
	            for (int j=S[i]; j<=n; j++)
	                table[j] += table[j-S[i]];
	 
	        return table[n];*/
		if(m>0&&n==0)
			return 1;
		if(n<0)
			return 0;
		if(n>0&&m<=0)
			return 0;
		
		return getSum(S,m,n-S[m-1]) + getSum(S,m-1,n);
	}
	
}
