class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] arr = new int[2];
        Arrays.fill(arr, -1);
        
        if(nums.length == 0) return arr;
        
        int start = 0;
        int end = nums.length - 1;
        
        while(start <= end){
            int mid = start + (end - start) / 2;
            
            if(target < nums[mid]){
                end = mid - 1;
            } else if(target > nums[mid]){
                start = mid + 1;
            } else {
                arr[0] = findStartingIndex(nums, target, start, mid);
                arr[1] = findEndingIndex(nums, target, mid, end);
                return arr;
            }
        }
        return arr;
    }
    
    private int findStartingIndex(int[] nums, int target, int start, int end) {
        int index = -1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] >= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            if(nums[mid] == target) index = mid;
        }
        return index;
    }
    
    private int findEndingIndex(int[] nums, int target, int start, int end) {
        int index = -1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            if(nums[mid] == target) index = mid;
        }
        return index;
    }
}


// class Solution {
//     public int[] searchRange(int[] nums, int target) {
        
//         int [] arr=new int[2];
//         if(nums.length==1 && target==nums[0]){
//             arr[0]=0;
//             arr[1]=0;
//             return arr;
//         }
//         Arrays.sort(nums);
//         Arrays.fill(arr,-1);
//         if(nums.length==0) return arr;
//         int start=0;
//         int end=nums.length-1;
//         while(start<end){
//         int d=(start + (end - start))/2;
//         if(target<nums[d]){
//             end=d-1;
//         }
//         if(target>nums[d]){
//             start=d+1;
//         }
//         if(target==nums[d]){
//             if(target==nums[d-1] && target==nums[d+1]){
//                 arr[0]=d-1;
//                 arr[1]=d+1;
//             }else
//             if(target==nums[d-1]){
//                 arr[0]=d-1;
//                 arr[1]=d;
//             }else
//             if(target==nums[d+1]){
//                 arr[0]=d;
//                 arr[1]=d+1;
//             }
//         }
//         start++;
//         end--;
//         }
//         return arr;
//     }
// }