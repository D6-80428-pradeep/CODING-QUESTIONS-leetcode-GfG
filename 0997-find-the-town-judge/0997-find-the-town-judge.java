class Solution {
    public int findJudge(int n, int[][] trust) {
        
        int [] trus=new int[n+1];

        for(int[]a:trust){
            trus[a[0]]-=1;
            trus[a[1]]+=1;
        }

        for(int t=1;t<=n;t++){
            if(trus[t]==n-1) return t;
        }
        return -1;
    }
}