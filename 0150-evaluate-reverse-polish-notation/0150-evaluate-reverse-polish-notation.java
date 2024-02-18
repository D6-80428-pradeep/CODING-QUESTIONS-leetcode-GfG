class Solution {
    
    public int evalRPN(String[] tokens) {
        Stack<Integer>stack=new Stack<>();

        for(String str:tokens){
            if("+".equals(str)){
                 stack.push(stack.pop()+stack.pop());
            }else if("-".equals(str)){
                 int d=stack.pop();
                 int p=stack.pop();
                 stack.push(p-d);
            }else if("*".equals(str)){
                 stack.push(stack.pop()*stack.pop());
            }else if("/".equals(str)){
                 int q=stack.pop();
                 int w=stack.pop();
                 stack.push(w/q);           
            }else{
                stack.push(Integer.valueOf(str));
            }
        }
         return stack.pop();
    }
}