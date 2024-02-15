class Solution {
    public long largestPerimeter(int[] nums) {
        long sum=0;
        Arrays.sort(nums);
        for(int n:nums){
          sum+=n;
        }
        for(int i=nums.length-1;i>=2;i--){
            sum-=nums[i];
            if(sum>nums[i]){
                return sum+nums[i];
            }
        }
       return -1;
        
    }
}