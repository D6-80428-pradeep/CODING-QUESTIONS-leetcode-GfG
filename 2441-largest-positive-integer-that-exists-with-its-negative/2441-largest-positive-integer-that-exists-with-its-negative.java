class Solution {
    public int findMaxK(int[] nums) {
       Arrays.sort(nums);
       int l=0;
       int r=nums.length-1;
       int max=-1;
       while(l<r){  
        if(nums[l]+nums[r]==0){
            max=Math.max(max,nums[r]);
            l++;
            r--;
        }else if(nums[l]+nums[r]<0){
            l++;
        }else{
            r--;          
        }            
       }
       return  max;
    }
}