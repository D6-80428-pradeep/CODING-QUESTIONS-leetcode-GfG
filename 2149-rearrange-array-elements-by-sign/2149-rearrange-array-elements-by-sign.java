class Solution {
    public int[] rearrangeArray(int[] nums) {
        int l=nums.length;
        int [] p=new int [l/2];
        int [] n=new int [l/2];
        int [] ans=new int[l];
        int t=0;
        int d=0;
        for(int i=0;i<l;i++){
            if(nums[i]>0){
                p[t++]=nums[i];
            }else{
                n[d++]=nums[i];
            }
        }
        int x=0;
        int y=0;
        for(int i=0;i<l;i++){

            if(i%2==0){
                ans[i]=p[x++];
            }else{
                ans[i]=n[y++];
            }
        }
        return ans;
    }
}