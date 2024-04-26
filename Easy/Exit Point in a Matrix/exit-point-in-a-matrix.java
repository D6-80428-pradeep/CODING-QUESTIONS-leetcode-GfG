//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] matrix = new int[n][m];
            for (int i = 0; i < n; i++) {
                String[] S = br.readLine().split(" ");
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution ob = new Solution();
            int[] ans = ob.FindExitPoint(n, m, matrix);
            for (int i = 0; i < ans.length; i++) System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int[] FindExitPoint(int n, int m, int[][] mat) {
        
        int []ans=new int [2];
        String [] helper=new String[] {"east","south","west","north"};
        String direction="east";
        int directionx=0;
        
        int i=0;
        int j=0;
        while(i>=0 && i<n && j>=0 && j<m){
            
            if(mat[i][j]==1){
                mat[i][j]=0;
                directionx=(directionx+1)%helper.length;
                direction=helper[directionx];
            }
            if(direction.equals("east")) j++;
            else if(direction.equals("west")) j--;
            else if(direction.equals("north")) i--;
            else if(direction.equals("south")) i++;
        }
        if(i<0)i++;
        else if(i>=n) i--;
        if(j<0) j++;
        else if(j>=m) j--;
        
        ans[0]=i;
        ans[1]=j;
        return ans;
        
    }
}