package DynamicProgrammin;

import java.util.Scanner;

public class LCS {
	static int res[][];
	static int fin[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m =s.nextInt();
		int a[] = new int[n];
		int b[] = new int[m];
		for(int i=0;i<n;i++)
			a[i] =s.nextInt();
		for(int i =0;i<m;i++)
			b[i]=s.nextInt();
		res=new int[n][m];
		
		for(int i =0 ;i<n;i++) {
			for(int j=0;j<m;j++) {
				res[i][j]=-1;
			}
		}
		//for(int r:fin)
		int index = Lcs(a,b,n,m);
		fin = new int [index];
		int i=n,j=m,y=index-1;
		while(i>=1&&j>=1) {
			if(a[i-1]==b[j-1]) {
				fin[y]=a[i-1];
				y--;i--;j--;
			}else {
				if(res[i-2][j-1]>res[i-1][j-2])
					i--;
				else
					j--;
			}
		}
		for(int r:fin)
		System.out.print(r + " ");
	}

	public static int Lcs(int[] a,int []b,int n,int m) {
		
		if(n==0 || m==0) {
			res[n][m]=0;
			return 0;
		}
		if(a[n-1]==b[m-1]) {
			if(res[n-1][m-1]==-1) {
				res[n-1][m-1]= 1 + Lcs(a,b,n-1,m-1);
			}
			return res[n-1][m-1];
		}
		else {
			if(res[n-1][m-1]==-1) {
				int x = Lcs(a,b,n-1,m);
				int y = Lcs(a,b,n,m-1);
				res[n-1][m-1]= (Math.max(x, y));
				
			}
			return res[n-1][m-1];
		}
		 
	}
}
