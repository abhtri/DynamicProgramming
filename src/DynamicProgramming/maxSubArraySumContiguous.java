package DynamicProgrammin;

import java.util.Scanner;

public class maxSubArraySumContiguous {

	public static void main(String[] args) {
		// kadanes algorithm
		
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
	
		for(int i_t=0;i_t<t;i_t++) {
			int n = s.nextInt();
			int a[]=new int[n];
			for(int i = 0;i<n;i++) {
				a[i]=s.nextInt();
			}
			int max =0;
			int maxSum=0;
			int contMax=Integer.MIN_VALUE;
			for(int i=0;i<n;i++) {
				if(a[i]>0) {
					contMax+=a[i];
				}
				maxSum= Math.max(a[i], maxSum+a[i]);
				if(maxSum>max) {
					max=maxSum;
				}
				if(maxSum<0) {
					maxSum=0;
				}
			}
			System.out.println(max+" "+ contMax);
		}

	}

}
