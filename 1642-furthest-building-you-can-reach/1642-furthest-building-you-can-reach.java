class Solution {
    public int furthestBuilding(int[] h, int bricks, int ladders) {
           
            PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)-> b-a);
            int i,diff=0;
            for(i=1;i<h.length;i++){

                diff=h[i]-h[i-1];
                if(diff<=0){
                    continue;
                }

                bricks-=diff;
                pq.add(diff);

                if(bricks<0){
                    bricks+=pq.poll();
                    ladders-=1;
                }

                if(ladders<0){
                    break;
                }
            }

             return i-1;
        }
        
}
