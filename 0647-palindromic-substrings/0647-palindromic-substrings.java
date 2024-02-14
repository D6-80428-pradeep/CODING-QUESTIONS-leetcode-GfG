class Solution {
    public boolean Palindromic(String s){
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        if(sb.toString().equals(s)){
            return true;

        }
        return false;
    }
    public int countSubstrings(String s) {
        int count=0;
           int n=s.length();
       for (int i = 0; i < n; i++) {
            for (int j = i+1; j <= n; j++) {
                if(Palindromic(s.substring(i, j))){
                    count++;
                }
            }
        }
        return count;
                
    }
}