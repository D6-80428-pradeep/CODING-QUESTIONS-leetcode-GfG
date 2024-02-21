class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        if(nums.length == 1) return nums[0];
        int [] arr = new int[nums.length + 1];
        arr[0] = 0;
        
        for(int i = 0; i < nums.length; i++){
            arr[i + 1] = arr[i] + nums[i];
        }
       
        int max = arr[k];

        for(int i = k; i < arr.length; i++){
            sum = arr[i] - arr[i - k];
            max = Math.max(sum, max);
        }
        return (double)max / k;
    }
}