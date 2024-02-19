class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>>ans=new ArrayList<>();
        Set<Integer>list1=new HashSet<>();
        Set<Integer>list2=new HashSet<>();
        List<Integer>ans1=new ArrayList<>();
        List<Integer>ans2=new ArrayList<>();
        for(int i:nums1){
            list1.add(i);
        }
        for(int t:nums2){
            if(!list1.contains(t)&&!ans1.contains(t)){
                 ans1.add(t);
            }
        }
        ans.add(ans2);

        for(int i:nums2){
            list2.add(i);
        }
        for(int t:nums1){
            if(!list2.contains(t) &&!ans2.contains(t)){
                 ans2.add(t);
            }
        }
        ans.add(ans1);
        return ans;
    }
}