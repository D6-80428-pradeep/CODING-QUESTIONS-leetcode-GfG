//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static String armstrongNumber(int n){
        int l=Integer.toString(n).length();
        int d=n;
        int sum=0;
        for(int i=0;i<l;i++){
            int k=n%10;
            sum+=Math.pow(k,l);
            n/=10;
        }
        if(sum==d){
            return "Yes";
        }
        return "No";
    }
}