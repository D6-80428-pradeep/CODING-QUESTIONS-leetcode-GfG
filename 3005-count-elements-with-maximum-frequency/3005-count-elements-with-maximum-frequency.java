class Solution {
    public int maxFrequencyElements(int[] nums) {
        
        Map<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        int max=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            max=Math.max(max,entry.getValue());
        }
        int ans=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(max==entry.getValue()){
               ans+= max;
            }
        }
        return ans;
    }
}