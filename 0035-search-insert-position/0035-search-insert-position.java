class Solution {
    public int searchInsert(int[] nums, int t) {
    int l=nums.length;

    if(t>=nums[0] && t<=nums[l-1]){
        for(int i=0;i<nums.length;i++){
        if(t==nums[i]){
            return i;
            }
        }
        for(int i=1;i<l;i++){
            if(t>nums[i-1] && t<nums[i]){
                return (i);
            }
        }
    }else if(t>=nums[l-1]+1){
        return l;
    }else if(t<=nums[0]-1){
        return 0;
    }
    return 0;
    }
}