class Solution {
    public int[][] generateMatrix(int n) {
        int [][] ans=new int [n][n];
        int v=1;
        int c1=0,c2=n,r1=0,r2=n;
         while(c1<=c2 && r1<=r2){

             for(int c=c1;c<c2;c++){
                 ans[r1][c]=v++;
             }
             for(int r=r1+1;r<r2;r++){
                 ans[r][c2-1]=v++;
             }

             if(c1<c2 && r1<r2){
                 for(int c=c2-2;c>c1;c--){
                     ans[r2-1][c]=v++;
                 }

                 for(int r=r2-1;r>r1;r--){
                     ans[r][c1]=v++;
                 }
             }
             c1++;
             c2--;
             r1++;
             r2--;         
             }  
         return ans;
    }
}