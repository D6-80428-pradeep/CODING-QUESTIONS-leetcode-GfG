class Solution {
    public String toLowerCase(String s) {
       String ss = "";

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                ss += (char)(s.charAt(i) + 32);
            } else {
                ss += s.charAt(i);
            }
        }

        return ss;

    }
}