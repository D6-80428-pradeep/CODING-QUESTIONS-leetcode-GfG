class Solution {
    public int finalValueAfterOperations(String[] op) {
        int x=0;
        for(String s:op){
            if(s.equals("++X")){
               ++x;
            }
            if(s.equals("X++")){
               x++;
            }
            if(s.equals("--X")){
               --x;
            }
            if(s.equals("X--")){
               x--;
            }
        }
        return x;
    }
}