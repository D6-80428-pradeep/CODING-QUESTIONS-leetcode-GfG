class Solution {
    public boolean backspaceCompare(String s, String t) {

        Stack<Character>stack1=new Stack<>();
        Stack<Character>stack2=new Stack<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#'){
                if(!stack1.isEmpty()){
                   stack1.pop();
                }
                
            }else{
                stack1.push(s.charAt(i));
            }
        }
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)=='#'){
                if(!stack2.isEmpty()){
                   stack2.pop();
                }
            }else{
                stack2.push(t.charAt(i));
            }
        }
        System.out.println(stack1);
        System.out.println(stack2);
        int count=0;

        if(stack1.size()==stack2.size()){
            for(int i=0;i<stack1.size();i++){
               if(!stack1.isEmpty() && !stack2.isEmpty()){
                   if(stack1.get(i)==stack2.get(i)){
                       count++;
                   }
               }
            }
        }else {
            return false;
        }
        if(count==stack2.size()) return true;
        return false;
    }
}