class Solution{
    public int [] dailyTemperatures(int [] t){

        Stack<Integer>stack=new Stack<>();
        int [] ans =new int [t.length];

        for(int i=0;i<t.length;i++){
            while(!stack.isEmpty() && t[stack.peek()]<t[i]){
                ans[stack.peek()]=i-stack.pop();
            }
            stack.push(i);
        }
        
         return ans;
    }
}



//below solution is raw causes TLE  so we have too use stack 
// class Solution {
//     public int[] dailyTemperatures(int[] t) {

//         int [] ans =new int [t.length];
        
//         for(int i=0;i<t.length;i++){
//             int count=0;
//             for(int j=i+1;j<t.length;j++){
//                 if(t[i]<t[j]){
//                     count=j-i;
//                     break;
//                 }
//             }
//             ans[i]=count;
//         }
//         return ans;
//     }
// }