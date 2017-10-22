package DynamicProgramming;

import java.util.Scanner;

public class AbbrRecursive {


    
        // Complete this function
    /*
     * 	A simple DP approach works. For example, a = "aBbdD" b = "BBD" since the last character in a is upper case and last character in b is also upper case and both are equal, f(a,b) = f("aBbd","BB")

		Now d can never be made equal to B therfore- f("aBbd","BB") = f("aBb","BB")

		Now b can be capitalized to B,therfore we have two options - either capitalize b to B or dont capitalize b. f("aBb","BB") = f("aB","B") or f("aB","BB") #Note that this is the 'or' operator. f is a boolean value.

		if we have something like a = 'C' and b = 'D' then f(a,b) evaluates to False (boolean value).

		Lastly (for initialization of the dp array)-

		if a is non-empty and b is empty, then f(a,b) is True only if all the characters in a are lower case.

		if a is empty and b is non-empty, then f(a,b) is always False.

		if both are empty then f(a,b) = True
     */
    	        // Complete this function
    	      //  a=a.toUpperCase();
    	/*if(n==0 && m==0)
            return true;
        if(n==0 && m>0)
            return false;
        if(n>0 & m==0){
            for(int i=0;i<n;i++){
                if(a.charAt(i)<91)
                    return false;
            }
            return true;
        }
            
    	          if(a.charAt(n-1)==b.charAt(m-1) && a.charAt(n-1)<91 ) {
    	        	  return abbreviation(a,b,n-1,m-1);
    	          }else if(Character.toUpperCase(a.charAt(n-1))==b.charAt(m-1)&& a.charAt(n-1)>91) {
    	        	  return abbreviation(a, b, n-1, m-1)||abbreviation(a,b,n-1,m);
    	          }else if(a.charAt(n-1)>91 && b.charAt(m-1)!=a.charAt(n-1))
    	        	  return abbreviation(a,b,n-1,m);
                   else if(a.charAt(n-1)<91 && b.charAt(m-1)!=a.charAt(n-1))
    	        	  return false;
    	        	  
    	          else
    	        	  return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String a = in.next();
            String b = in.next();
            boolean result = abbreviation(a, b,a.length(),b.length());
            if(result)
            System.out.println("YES");
            else
            	System.out.println("NO");
        }
        in.close();
    }
*/
    	
    	static int c[][];
        static int abbreviation(String a, String b,int n ,int m ) {
            // Complete this function
            if(n==0 && m==0){
                c[n][m]=1;
                return c[n][m];
            }
            if(n==0 && m>0){
                c[n][m] =0;
                return 0;
            }
            if(n>0 & m==0){
                if(c[n][m]==-1){
                    for(int i=0;i<n;i++){
                        if(a.charAt(i)<91) {
                            c[n][m]=0;
                            return c[n][m];
                        }
                    }
                }
                c[n][m]=1;
                return c[n][m];
            }
                
        	          if(a.charAt(n-1)==b.charAt(m-1) && a.charAt(n-1)<91 ) {
                          if(c[n][m]==-1)
                          {c[n][m]= abbreviation(a,b,n-1,m-1);
                           return c[n][m];
                          }
                          else
                              return c[n][m];
                              
        	          }else if(Character.toUpperCase(a.charAt(n-1))==b.charAt(m-1)&& a.charAt(n-1)>91) {
        	        	  if(c[n][m]==-1)
                          {
                              c[n][m]= abbreviation(a, b, n-1, m-1)|abbreviation(a,b,n-1,m);
                          }
                         return c[n][m];
                         
        	          }else if(a.charAt(n-1)>91 && b.charAt(m-1)!=a.charAt(n-1)){
                           if(c[n][m]==-1)
                          {
        	        	       c[n][m]= abbreviation(a,b,n-1,m);
                           }
                            return c[n][m];
                      }
                       else if(a.charAt(n-1)<91 && b.charAt(m-1)!=a.charAt(n-1)){
                            if(c[n][m]==-1)
                          {
        	        	  c[n][m]= 0;
                           }
        	        	  return c[n][m];
                     }
        	          else
        	        	  return 0;

        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int q = in.nextInt();
            for(int a0 = 0; a0 < q; a0++){
                String a = in.next();
                String b = in.next();
                int n = a.length();
                int  m = b.length();
                c = new int[n+1][m+1];
                for(int i =0;i<=n;i++){
                    for(int j=0;j<=m;j++){
                        c[i][j]=-1;
                    }
                }
                int result = abbreviation(a, b,n,m);
                if(result ==1)
                System.out.println("YES");
                else
                   System.out.println("NO"); 
            }
            in.close();
        }
}
