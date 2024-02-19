class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        int j=0;
        int i=s.length()-1;
        while(i>=0){
            if(s.charAt(i)==' '){
                i--;
            }else{
                j=i;
                while(i>=0&&s.charAt(i)!=' '){
                    i--;
                }
                if(sb.length()>0){
                    sb.append(' ');
                }
                sb.append(s.substring(i+1,j+1));
            }
        }
        return sb.toString().trim();
    }
}