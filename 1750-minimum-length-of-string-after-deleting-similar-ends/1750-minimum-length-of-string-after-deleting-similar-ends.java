class Solution {
    public int minimumLength(String s) {

        int i=0;
        int e=s.length()-1;
        int count=0;
        while(i<e && e<s.length() && i<s.length()-1){
            if(s.charAt(i)==s.charAt(e)){
                while(i<e && s.charAt(i)==s.charAt(i+1)){
                    i++;
                }
                while(i<e && s.charAt(e)==s.charAt(e-1)){
                    e--;
                }

                i++;
                e--;
            }else{
                break;
            }
            
        }
        if(e-i+1<0) return 0;
        return e-i+1;
    }
}