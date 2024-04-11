class Solution {
    public String removeDigit(String number, char digit) {
         StringBuilder sb=new StringBuilder(number);
         StringBuilder max=new StringBuilder("-1");

         for(int i=0;i<number.length();i++){
            
            if(sb.charAt(i)==digit){
                StringBuilder ans=new StringBuilder (sb.deleteCharAt(i));
                if(ans.compareTo(max)>0){
                    max=ans;
                }
                sb.insert(i,digit);
            }
         }
         return max.toString();
    }
}