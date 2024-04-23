//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String inline[] = in.readLine().trim().split("\\s+");
            int n = Integer.parseInt(inline[0]);
            int m = Integer.parseInt(inline[1]);
            String inline1[] = in.readLine().trim().split("\\s+");
            int M[][] = new int[n][m];
            for(int i = 0;i < n*m;i++){
                M[i/m][i%m] = Integer.parseInt(inline1[i]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.maxGold(n, m, M));
        }
    }
} 
// } Driver Code Ends




//User function Template for Java

class Solution{
    static int maxGold(int n, int m, int M[][])
    {
        int max=0;
        if(n == 1){
		    for(int i=0;i<m;i++){
		        max += M[0][i];
		    }
		   
		}else{
        for(int j=M[0].length-2;j>=0;--j){
            for(int i=0;i<M.length;++i){
                
                if(i==0){
                    
                    M[i][j]+=Math.max(M[i+1][j+1],M[i][j+1]);
                    
                }else if(i==M.length-1){
                    
                    M[i][j]+=Math.max(M[i-1][j+1],M[i][j+1]);
                    
                    
                }else{
                    
                    M[i][j]+=Math.max(M[i][j+1], Math.max(M[i-1][j+1],M[i+1][j+1]));
                }
        }
        
    }
     
    max=M[0][0];
   
    for(int q=0;q<M.length;q++){
        
        if(M[q][0]>max){
            max=M[q][0];
        }
    }
	}
	
    return max;
    }
}
