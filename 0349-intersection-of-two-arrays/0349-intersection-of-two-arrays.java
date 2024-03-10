class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer>set1=new HashSet<>();
        Set<Integer>set2=new HashSet<>();
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            if(!set1.contains(nums1[i])){
                set1.add(nums1[i]);
            }
        }
        for(int i=0;i<nums2.length;i++){
            if(!set2.contains(nums2[i])){
                set2.add(nums2[i]);
            }
        }
        for(Integer value:set1){
            if(set2.contains(value)){
                list.add(value);
            }
        }
        int [] ans=new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
return ans;   
    }
}