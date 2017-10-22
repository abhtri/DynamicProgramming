package DynamicProgramming;

import java.util.Scanner;

public class SubstringDiff {
	 
	public static boolean solve(int mid,int l,int[][]c,int s) {
		
			for(int i = mid;i <= l;i++)
		    {
		            for(int j = mid;j <= l;j++)
		            {
		                int tmp = c[i][j] - c[i-mid][j-mid];
		                if(tmp <= s) return true;
		            }
		     }
		        return false;
		
	}
    public static int LCSMod(String a, String b,int n, int m , int x) {
		
		// General recursive Algo for Largest Common Subsequce //
		
		/*if(n==0 || m==0 ) {
			return 0;
		}
		if(a.charAt(n-1)==b.charAt(m-1)) {
			return 1+LCSMod(a,b,n-1,m-1,x);
		}else {
			return Math.max(LCSMod(a,b,n-1,m,x), LCSMod(a,b,n,m-1,x));
		}*/
		
		// Code for iterative Largest common subsequence //
	/*	int [][] c = new int [n+1][m+1];
		for(int i =1;i<n;i++) {
			c[0][i]=0;
		}
		for(int i =1;i<n;i++) {
			c[i][0]=0;
		}
		
		for(int i =1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(a.charAt(i-1)==b.charAt(j-1)) {
					c[i][j] = 1 + c[i-1][j-1];
				}else {
					c[i][j] = Math.max(c[i][j-1],c[i-1][j]);
				}
			}
		}
		return c[n][m];
		*/
		/* code for longest substring
		 * 
		 */
		int result =0;
		
		int [][] c = new int [n+1][m+1];
		//int [][] d= new int [n][m];
		
		int d=x;
		for(int i =1;i<=n;i++) {
			
			for(int j=1;j<=m;j++) {
				if(a.charAt(i-1)==b.charAt(j-1)) {
					c[i][j] = c[i-1][j-1];
				
				}else {
					c[i][j] = c[i-1][j-1]+1;	
					
				}
			}
		}
		
		/*for(int i =1;i<=n;i++) {
			
			for(int j=1;j<=m;j++) {
				System.out.print(c[i][j] +" ");
			}
			System.out.println("");
		}*/
		
		int low = 0,high = n,mid;
        while(low < high)
		{
            mid = (low + high + 1) >> 1;
            if(solve(mid,n,c,d)) low = mid;
            else high = mid - 1;
        }
		return low;
				
		
		
	}
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String  str = sc.next();
		int t = Integer.parseInt(str);
		for(int it = 0;it<t;it++) {
			int x=sc.nextInt();
			String s2 = sc.next();
			String s3 = sc.next();		
			String a = s2;
			String b= s3;
			int res = LCSMod(a,b,a.length(),b.length(),x);
			System.out.println(res);
		}
	
    }

	

}
