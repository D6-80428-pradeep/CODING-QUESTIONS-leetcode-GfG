class Solution {
    public String customSortString(String order, String s) {
        Map<Character,Integer>map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        StringBuilder sb=new StringBuilder();
        for(char cc:order.toCharArray()){
            if(map.containsKey(cc)){
                int ff=map.get(cc);
                while(ff-->0){
                    sb.append(cc);
                }
                map.remove(cc);
            }
        } 
        for(char chc:map.keySet()){
            if(map.get(chc)!=0){
                int f=map.get(chc);
                while(f-->0){
                    sb.append(chc);
                }
                
            }
        }
        return sb.toString();
    }
}