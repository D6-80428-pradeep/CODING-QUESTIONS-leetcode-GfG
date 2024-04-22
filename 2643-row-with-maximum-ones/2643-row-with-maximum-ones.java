class Solution {
    public int[] rowAndMaximumOnes(int[][] a) {
        int []pp=new int [2];
        int [] ans=new int[a.length];
        for(int i=0;i<a.length;i++){
            int count=0;
            for(int j=0;j<a[0].length;j++){
                if(a[i][j]==1){
                    count++;
                }
            }
            ans[i]=count;
        }
        int an=Integer.MIN_VALUE;
        for(int i=a.length-1;i>=0;i--){
            an=Math.max(an,ans[i]);
        }
        int index=0;
        for(int i=a.length-1;i>=0;i--){
            if(ans[i]==an){
                index=i;
            }
        }
        pp[0]=index;
        pp[1]=an;
        
        return pp;
    }
}