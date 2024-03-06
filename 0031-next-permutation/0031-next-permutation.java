class Solution {
    public void nextPermutation(int[] nums) {
        int index1=0;
        int f=0;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
               index1=i;
               f=1;
               break;
            }
        }
        int index2=0;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]>nums[index1]){
               index2=i;
               break;
            }
        }
        int t=nums[index1];
        nums[index1]=nums[index2];
        nums[index2]=t;
        int i=index1+1;
        if(f==0){
            i=index1;
        }
       int l=nums.length-1;
       while(i<l){
           int tt=nums[l];
           nums[l]=nums[i];
           nums[i]=tt;
           i++;
           l--;
       }
    }
}