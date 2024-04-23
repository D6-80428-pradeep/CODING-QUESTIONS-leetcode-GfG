//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            int ans = obj.minCandy(n, a);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends




// User function Template for Java

class Solution {
    static int minCandy(int N, int ratings[]) {
        int l=ratings.length;
        int [] left=new int[l];
        int [] right=new int[l];
        int sum=0;
        Arrays.fill(left,1);
        Arrays.fill(right,1);
        for(int i=1;i<l;i++){
            if(ratings[i]>ratings[i-1]){
                left[i]=left[i-1]+1;
            }
        }
        for(int j=l-2;j>=0;--j){
         
            if(ratings[j]>ratings[j+1]){
                right[j]=right[j+1]+1;
            }
        }
        for(int k=0;k<l;++k){
            sum+=Math.max(left[k],right[k]);
        }
     return sum;  
    }
}
