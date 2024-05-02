class Solution {
    public int findMaxK(int[] nums) {
        int max=0;
        
        Set<Integer>set=new HashSet<>();
        for(int t:nums){
            set.add(t);
        }
        Arrays.sort(nums);
        int ans=-1;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            if(set.contains(-max)){
                ans=max;
            }
        }
        return ans;
    }
}