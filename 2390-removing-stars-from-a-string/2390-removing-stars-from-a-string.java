class Solution {
    public String removeStars(String s) {
        Stack<Character> stack=new Stack<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='*'){
                stack.push(s.charAt(i));
            }else{
                stack.pop();
            }
        }
        StringBuilder sb= new StringBuilder();

        for(int i=0;i<stack.size();i++){
           sb.append(stack.get(i));
        }
        return sb.toString(); 
    }
}