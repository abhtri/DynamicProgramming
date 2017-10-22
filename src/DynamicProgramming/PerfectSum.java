package DynamicProgrammin;

import java.util.Scanner;

public class PerfectSum {
	static long cache[][];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int j=0;j<t;j++) {
			int n = s.nextInt();
			int a[]=new int[n];
			for(int i =0;i<n;i++) {
				a[i]=s.nextInt();
			}
			int m = s.nextInt();
			cache = new long[n+1][m+1];
			System.out.println(count(a,n,m));
		}
		
	}
	public static long count(int[] a,int n ,int s) {
		if(s<0)
			return 0;
		if(n>=0 && s==0) {
			cache[n][s]=1;
			return 1;
		}
		if(n<=0 && s>0) {
			return 0;
		}
		cache[n][s]= count(a,n-1,s-a[n-1]) + count(a,n-1,s);
		return cache[n][s];
		
	}
}
