class Solution {

    public boolean palind(String s){
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        if(sb.toString().equals(s)){
            return true;
        }else{
            return false;
        }
    }
    public String firstPalindrome(String[] words) {
        String s="";
        for(int i=0;i<words.length;i++){

            if(palind(words[i])){
                return words[i];
            }
        } 
        return s;
    }
}