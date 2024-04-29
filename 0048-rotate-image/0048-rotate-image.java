class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int [][] work=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                work[i][j]=matrix[n-1-j][i];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=work[i][j];
            }
        }
        
    }
}