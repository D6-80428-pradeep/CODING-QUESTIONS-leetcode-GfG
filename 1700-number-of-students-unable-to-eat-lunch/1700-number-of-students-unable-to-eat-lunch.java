class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
       Queue<Integer>queue=new LinkedList<>();
       Stack<Integer>stack=new Stack<>();
       for (int i = sandwiches.length - 1; i >= 0; i--) {
            stack.push(sandwiches[i]);
        }
        for (int student : students) {
            queue.offer(student);
        }
       int count=0;
       while(!queue.isEmpty() && count<queue.size()){
       for(int i=0;i<students.length;i++){         
         if( !stack.isEmpty() && queue.peek().equals(stack.peek())){
            stack.pop();
            queue.poll();
            
            count=0;
         }else{
            queue.offer(queue.peek());
            queue.poll();
            count++;
         }
       }
       }
        return queue.size();
    }
}