class Solution {
    public int largestPerimeter(int[] nums) {
        
        Arrays.sort(nums);
        int sum=0;
        
        if(nums.length<3) return 0;
        
        for(int i=nums.length-1;i>=2;i--){
            
            if(nums[i]<(nums[i-1]+nums[i-2])){
                sum=Math.max(sum,nums[i]+nums[i-1]+nums[i-2]);
                break;
            }
        }
        return  sum;
    }
}