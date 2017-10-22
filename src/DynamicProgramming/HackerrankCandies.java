package DynamicProgrammin;

import java.util.Arrays;
import java.util.Scanner;

public class HackerrankCandies {

    static int candies(int n, int[] arr) {
        // Complete this function
      //  Arrays.sort(arr);
        int count = 0;
        int temp,min=1;
        int a[]=new int [n];
        count =0;
        //temp =arr[0];
        a[0]=1;
        int k=0;
        for(int i =1;i<n;i++) {
        	if(a[i]==0)
        		a[i]=1;
        	if(arr[i]>arr[i-1]) {
        		a[i] =a[i-1]+1;
        	}
        	
        }
        for(int i =n-1;i>0;i--) {
        	if(arr[i-1]>arr[i] && a[i-1]<=a[i]) {
        		a[i-1] =a[i]+1;
        	}
        	
        }
        for(int i=0;i<n;i++) {
        	System.out.println(a[i]);
        	count += a[i];
        }
        return count ;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = candies(n, arr);
        System.out.println(result);
        in.close();
    }
}
