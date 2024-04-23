//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            int ans[] = obj.Series(n);
            for (int i : ans) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {
    
    int[] Series(int n) {
        int [] arr=new int[n+1];
        
        int a=0;
        int b=1;
        
        for(int i=0;i<=n;i++){
            if(i==0){
                arr[i]=0;
            } else if(i==1){
                arr[i]=b;
            } else{
                int sum=(a% 1000000007+b% 1000000007 )% 1000000007 ;
                a=b;
                b=sum;
                arr[i]=sum;
            }
        }
        return arr;
    }
}