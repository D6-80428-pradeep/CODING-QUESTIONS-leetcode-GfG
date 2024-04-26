class Solution {
    public void setZeroes(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int [][] work=new int[n][m];

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0){
                    for(int k=0;k<m;k++){
                        work[i][k]=-1;
                    }
                    for(int k=0;k<n;k++){
                        work[k][j]=-1;
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(work[i][j]==-1){
                    mat[i][j]=0;
                }
            }
        }
    }
}