class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length()==1){
            return 1;
        }
        int count=0;
        String ss=s.trim();
        for(int i=ss.length()-1;i>=0;i--){
            if(ss.charAt(i)==32){
                count=i+1;
                break;
            }
            if(ss.length()==1){
            return 1;
        }
        }
            String g=ss.substring(count,ss.length());
        return g.length(); 
    }
    
}