class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count++;
            }
        }
        String sb="";
        for(int i=0;i<s.length()-1;i++){
            if(count>1){
                sb+="1";
                count--;
            }else{
                sb+="0";
            }
        }
        sb+="1";  
        return sb;
    }
}