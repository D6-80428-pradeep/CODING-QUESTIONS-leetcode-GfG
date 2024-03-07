class Solution {
    public List<Integer> tolist(int []nums){
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        return list;
    }
    public void swap(int i,int start,int[] nums){
        int t=nums[i];
        nums[i]=nums[start];
        nums[start]=t;
    }
    public void backtrack(List<List<Integer>> list,int[] nums,int start){
        if(start==nums.length){
                list.add(tolist(nums));
                return;
        }else{
            for(int i=start;i<nums.length;i++){
               swap(i,start,nums);
               backtrack(list,nums,start+1);
               swap(i,start,nums);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        backtrack(list,nums,0);
        return list;
    }
}