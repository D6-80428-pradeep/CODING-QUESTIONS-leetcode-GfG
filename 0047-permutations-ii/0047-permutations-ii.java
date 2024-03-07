class Solution {
    public List<Integer> tolist(int []nums){
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        return list;
    }
    public void swap(int i,int start,int []nums){
        int t=nums[i];
        nums[i]=nums[start];
        nums[start]=t;
    }
    public void permu(List<List<Integer>>list,int[] nums,int start){
        if(start==nums.length){
            if(!list.contains(tolist(nums))){
                list.add(tolist(nums));
            }
        }else{
            for(int i=start;i<nums.length;i++){
                swap(i,start,nums);
                permu(list,nums,start+1);
                swap(i,start,nums);
            }
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>>list=new ArrayList<>();
        permu(list,nums,0);
        return list;
    }
}