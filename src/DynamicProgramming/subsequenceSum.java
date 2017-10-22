package DynamicProgrammin;

import java.math.BigInteger;
import java.util.Scanner;

public class subsequenceSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

/*		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		String[] string_array = string.split("");
		long sum = 0;
		long _mod = (long) Math.pow(10, 9) + 7;
		//BigInteger bi_mod = new BigInteger(Long.toString(_mod));
		int ind=0;
		long prev_iter_sum = Long.parseLong(string_array[0]);
		long prev_iter_total_sum = prev_iter_sum;
		for(int i=1;i<string_array.length;i++) {
			String c = string_array[i];
			long c_long = Long.parseLong(c);
			long my_sum = (prev_iter_sum*10 + c_long*(i+1)) % _mod;
			long my_total_sum = (prev_iter_total_sum + my_sum) % _mod;

			prev_iter_sum = my_sum;
			prev_iter_total_sum = my_total_sum;
		}
		System.out.println(prev_iter_total_sum);
		*/
		
		 Scanner in = new Scanner(System.in);
	        String s = in.next();
	      //  System.out.println(n);
	        long a[]=new long[s.length()];
	        long l = Long.parseLong(s);
	        long n = s.charAt(0)-48;
	        a[0]=n;
	        long count = a[0];
	        long mul=0;
	        for(int i=1;i<s.length();i++) {
	        	int z= s.charAt(i)-48;
	        	n = (z)*(i+1)%1000000007;
	        	//mul=(a[i-1]*10)%1000000007;
	        	long x=a[i-1];
	        	long y = 10;
	        	mul=   (x*y)%1000000007;
	        	a[i]= (n%1000000007+mul%1000000007);
	        	count =(count +a[i])%1000000007;
	        }
	        System.out.println(count);
	        
	}

}
