package DynamicProgrammin;

import java.util.Scanner;

public class RobotPath {

	public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n
        = s.nextInt();
        int startPosX=-1,startPosY=-1;
        int finalPosX=-1,finalPosY=-1;
        int grid[][]=new int[m][n];
        String st;
        String str[];
        for (int i = 0; i < m; i++) {
        	
        		st= s.next();
        	//	str=st.split(" ");
        	for(int j=0;j<n;j++) {
        		if(st.charAt(j)=='.') {
        			grid[i][j]=0;
        		}
        		if(st.charAt(j)=='*') {
        			grid[i][j]=-1;
        		}
        		if(st.charAt(j)=='H') {
        			finalPosX=i;
        			finalPosY=j;
        		}
        		if(st.charAt(j)=='V') {
        			
        			startPosX=i;
        			startPosY=j;
        		}
        	}
        	
        	
        }
       
        for(int i =startPosX;i<m;i++) {
    		if(grid[i][startPosY]==-1) {
    			break;
    		}
        	grid[i][startPosY]=1;
    	}
        
        for(int i =startPosY+1;i<n;i++) {
    		if(grid[startPosX][i]==-1) {
    			break;
    		}
        	grid[startPosX][i]=1;
    	}
        
        
        for(int i = startPosX+1;i<m;i++) {
        	for(int j=startPosY+1;j<n;j++) {
        		if(grid[i][j]==-1) {
        			continue;
        		}
        		if(grid[i-1][j]>0) {
        			grid[i][j]=grid[i-1][j]+grid[i][j];
        		}
        		if(grid[i][j-1]>0) {
        			grid[i][j]=grid[i][j-1]+grid[i][j];
        		}
        	}
        }
       
        System.out.println(grid[finalPosX][finalPosY]);
    }

}
