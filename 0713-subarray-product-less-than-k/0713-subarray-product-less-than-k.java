class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
      int n=nums.length;

      int start=0;
      int end=0;

      int p=1;
      int count=0;
      while(end<n){

        p*=nums[end];
        while(p>=k && start<=end){
               p/=nums[start];
               start++;
        }
        if(p<k){
            count+=(end-start+1);
        }  
        end++;
      }
      return count;
    }
}