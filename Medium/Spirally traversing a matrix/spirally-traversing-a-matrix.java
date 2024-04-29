//{ Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int x, int q)
    {
         ArrayList<Integer>list=new ArrayList<>();
        int c1=0,c2=matrix[0].length-1,r1=0,r2=matrix.length-1;
        
        while(c1<=c2 && r1<=r2){
            for(int c=c1;c<=c2;c++){
              list.add(matrix[r1][c]);
            }

            for(int r=r1+1;r<=r2;r++){
                list.add(matrix[r][c2]);
            }

            if(c1<c2 && r1<r2){
                for(int c=c2-1;c>=c1;c--){
                    list.add(matrix[r2][c]);
                }
                for(int r=r2-1;r>r1;r--){
                    list.add(matrix[r][c1]);
                }
            }

            c1++;
            c2--;
            r1++;
            r2--;
        }
        return list;
    }
}
