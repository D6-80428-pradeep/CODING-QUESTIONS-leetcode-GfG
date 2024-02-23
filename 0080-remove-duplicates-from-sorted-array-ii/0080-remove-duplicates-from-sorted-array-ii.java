class Solution {
    public int removeDuplicates(int[] nums) {

        int index=1;
        int occ=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
               occ++;
            }else{
                occ=1;
            }
            if(occ<=2){
                nums[index++]=nums[i];
            }
        }
        return index;
    }
}