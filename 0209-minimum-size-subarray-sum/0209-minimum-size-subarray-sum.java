class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            while (sum >= target) {
                ans = Math.min(ans, i + 1 - left);
                sum -= nums[left++];
            }
        }
        return (ans != Integer.MAX_VALUE) ? ans : 0;
    }
}


// class Solution {
//     public int minSubArrayLen(int target, int[] nums) {

//         List<Integer>list=new ArrayList<>();
//         list.add(nums[0]);
//         for(int i=1;i<nums.length;i++){
//            list.add(list.get(i-1)+nums[i]);
//         }
//           int ans=0;
//          System.out.println(list);

//          for(int i=0;i<list.size();i++){
//              if(list.contains(target+list.get(i))){
//                   ans=list.indexOf(target+list.get(i))-i;
//              }
//          }

//         return ans; 
//     }
// }