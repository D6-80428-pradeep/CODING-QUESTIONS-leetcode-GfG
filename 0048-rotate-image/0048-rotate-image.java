class Solution {
    public void rotate(int[][] mat) {
         for(int i=0;i<mat.length;i++){
            for(int j=i;j<mat[0].length;j++){
                int d=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=d;
            }
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length/2;j++){
                int d=mat[i][j];
                mat[i][j]=mat[i][mat.length-1-j];
                mat[i][mat.length-1-j]=d;
            }
        }
    }
}