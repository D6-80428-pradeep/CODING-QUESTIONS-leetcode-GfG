//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s[] = read.readLine().split(" ");
            int N = Integer.parseInt(s[0]);
            int M = Integer.parseInt(s[1]);
            int Mat[][] = new int[N][M];
            for (int i = 0; i < N; i++) {
                String S[] = read.readLine().split(" ");
                for (int j = 0; j < M; j++) {
                    Mat[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution ob = new Solution();
            System.out.println(ob.findMaxSum(N, M, Mat));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int findMaxSum(int n, int m, int mat[][]) {
        int ans=0;
        int res=0;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<m-1;j++){
                
                if(i-1>=0 && i+1<=n && j-1>=0 && j+1<=m){
                ans=mat[i][j]+mat[i-1][j]+mat[i-1][j-1]+mat[i-1][j+1]+mat[i+1][j]+mat[i+1][j-1]+mat[i+1][j+1];
                res=Math.max(res,ans);
                }
                
            }
        }
        if(res==0)return -1;
        return res;
    }
};