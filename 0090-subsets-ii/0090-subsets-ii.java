class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>list=new ArrayList<>();

        int l=nums.length;
        int x=1<<l;

        for(int i=0;i<x;i++){
           
           List<Integer>list1=new ArrayList<>();
           for(int t=0;t<l;t++){
               if((i&(1<<t))!=0){
                   list1.add(nums[t]);
                   Collections.sort(list1);
               }
           }

           if(!list.contains(list1)){
               
               list.add(list1);
           }
        }
        
        return list;
    }
}