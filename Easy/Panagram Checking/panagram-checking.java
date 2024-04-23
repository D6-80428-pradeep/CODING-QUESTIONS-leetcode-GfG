//{ Driver Code Starts
//Initial template for JAVA

import java.lang.*;
import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function template for JAVA

class Solution
{
    //Function to check if a string is Pangram or not.
    public static boolean checkPangram  (String s) {
       String ss=s.toUpperCase();
       Set<Character> map=new HashSet<>();
       for(int i=0;i<ss.length();i++){
           if(ss.charAt(i)>='A' && ss.charAt(i)<='Z'){    
             map.add(ss.charAt(i));
           }else{
               continue;
           }
       }
       if(map.size()==26) return true;
       return false;
    }
}


//{ Driver Code Starts.

class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  int t=Integer.parseInt(br.readLine());
	  while(t-->0)
	  {
	    String s=br.readLine().trim();
	    
	    System.out.println(new Solution().checkPangram (s)==true?1:0);
	  }
	  
	 }
}
// } Driver Code Ends