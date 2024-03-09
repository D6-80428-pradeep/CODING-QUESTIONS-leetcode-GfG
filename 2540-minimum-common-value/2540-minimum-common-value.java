class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
       int i=0;
       int t=0;
       while(i<nums1.length && t<nums2.length){
           if(nums1[i]==nums2[t]){
               return nums1[i];
           }else
           if(nums1[i]>nums2[t]){
               t++;
           }
           else{
               i++;
           }
      }
      return -1;
    }
}