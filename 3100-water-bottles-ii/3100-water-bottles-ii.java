class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        
        int sum=numBottles;
        int count=0;
        while(numBottles>=numExchange){
            numBottles=numBottles-numExchange;
            numBottles++;
            numExchange++;
            count++;
        }
        return sum+count;
        
    }
}