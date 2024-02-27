class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer,Integer> map = new TreeMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int count = 0;
        int[] arr = new int[100000];
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getKey() % 2 == 0){
                arr[entry.getKey()] = entry.getValue();
            } else {
                count++;
            }
        }
        if(count == map.size()) return -1;
        
        int max = 0;
        for(int i = 0; i < 100000; i += 2){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        for(int i = 0; i < 100000; i++){
            if(arr[i] == max){
                return i;
            }
        }
        return -1;
    }
}