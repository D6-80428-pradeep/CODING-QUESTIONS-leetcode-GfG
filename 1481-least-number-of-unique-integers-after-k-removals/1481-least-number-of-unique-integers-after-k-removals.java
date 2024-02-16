class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        
        List<Integer>list=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        if(k==0) return map.size();
        System.out.println(map);

        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            list.add(entry.getValue());
        } 
        Collections.sort(list);
        System.out.println(list);
        int count=0;
        for(int i=0;i<list.size();i++){
            k=k-list.get(i);
            if(k>0){
                 count++;
            }
            if(k==0){
                count++;
            }
            if(k<0){
                break;
            }
        }   
           return list.size()-count;
    }
}