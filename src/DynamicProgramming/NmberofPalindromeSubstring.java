package DynamicProgrammin;

import java.util.Scanner;

public class NmberofPalindromeSubstring {

public static int l[][];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String r= s.next();
		l = new int[r.length()+1][r.length()+1];
		for(int i=0;i<r.length();i++) {
			for(int j=0;j<r.length();j++) {
			l[i][j]=1;
		}
		}
		
		System.out.println(countPal(r,0,r.length()-1));
		
	}
	public static int countPal(String r,int i,int j) {
		if(i>j || j<0  ) {
			l[i][j]=0;
			//return 0;
		}
		if(i==j) {
		
		l[i][j]=1;
		//	return 1;
		}
		if(r.charAt(i)==r.charAt(j)) {
			l[i][j] = 2+countPal(r,i+1,j-1);
			//return  2+countPal(r,i+1,j-1);
		}
		else {
			if(l[i][j]!=1)
				l[i][j]= max(countPal(r,i,j-1),countPal(r, i+1, j));
		//return  max(countPal(r,i,j-1),countPal(r, i+1, j));
		}
		return l[i][j];
		
	}
	public static int max(int i,int j) {
		if(i>j)
			return i ;
		else
			return j;
	}

}
