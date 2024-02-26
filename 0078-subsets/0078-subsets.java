class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>>list=new ArrayList<>();
        int n=nums.length;
        int x=1<<n;

        for(int i=0;i<x;i++){
            List<Integer>listt=new ArrayList<>();
            for(int t=0;t<n;t++){
                if((i&(1<<t))!=0){
                    listt.add(nums[t]);
                }
            }
            list.add(listt);
        }
        return list;
    }
}