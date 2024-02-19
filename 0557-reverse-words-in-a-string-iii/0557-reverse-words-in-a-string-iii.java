class Solution {
    public String rev(String s){
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }
    public String reverseWords(String s) {
        String ss=s.trim();
        ss+=" ";
        StringBuilder ans=new StringBuilder();
        int i=0;
        int j=1;
        while(i<=j && j<ss.length()){
            if(ss.charAt(j)!=' '){
                j++;
            }else{
                ans.append(rev(ss.substring(i,j)));
                if(j!=ss.length()-1){
                  ans.append(" ");
                }
                
                j++;
                i=j;
            }
        }
        return ans.toString();
    }
}