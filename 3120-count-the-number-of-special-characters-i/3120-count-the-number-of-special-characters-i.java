class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character>set=new HashSet<>();
        
        for(char c:word.toCharArray()){
            if(!set.contains(c)){
                set.add(c);
            }    
        }
        
        int count=0;
        for(char c:set){
            
            char t=Character.isLowerCase(c)? Character.toUpperCase(c):Character.toLowerCase(c);
            
            if(set.contains(t)){
                count++;
            }
        }
        return count/2;
    }
}