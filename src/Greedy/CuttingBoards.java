package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class CuttingBoards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int t = s.nextInt();
		for(int it =0;it<t;it++) {
			int m = s.nextInt();
			int n = s.nextInt();
			int[] a = new int[m-1];
            int [] b = new int[n-1];			
			for(int i = 0 ;i<m-1;i++) {
				a[i]=s.nextInt();
			}
			for(int i = 0 ;i<n-1;i++) {
				b[i]=s.nextInt();
			}
			
			int x =1,y=1;
			long cost = 0;
			Arrays.sort(a);
			Arrays.sort(b);
			while(m-1+n-1>=0) {
				if(n-1==0 && m-2>=0 ) {
					cost = (cost + a[m-2]*y)%1000000007;
					x++;
					m--;
					continue;
				}
				if(m-1==0 && n-2>=0 ) {
					cost = (cost + b[n-2]*x)%1000000007;
					y++;
					n--;
					continue;
				}
				if(m-2>=0 && n-2>=0 && a[m-2]>=b[n-2]) {
					cost = (cost + a[m-2]*y)%1000000007;
					x++;
					m--;
				}else if(m-2>=0 && n-2>=0 && a[m-2]<b[n-2]){
					cost = (cost + b[n-2]*x)%1000000007;
					y++;
					n--;
				}else {
					m--; n--;
				}
			//	System.out.println(cost);
			}
			System.out.println(cost);
		}
	}

}
