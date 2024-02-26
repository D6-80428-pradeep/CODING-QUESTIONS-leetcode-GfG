class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {

        int x=numBottles;
        
        while(numBottles/numExchange>=1){

            int t=numBottles%numExchange;
             x+=numBottles/numExchange;
            
            numBottles=t+numBottles/numExchange;
        }
        return x;
    }
}