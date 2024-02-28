class Solution {
    public int coinChange(int[] coins, int amount) {

    int [] arr=new int[amount+1];
    Arrays.fill(arr,amount+1);
    arr[0]=0;

    for(int coin:coins){
        for(int i=coin;i<=arr.length-1;i++){
            arr[i]=Math.min(arr[i],arr[i-coin]+1);
        }
    }

    if(arr[amount]<=amount){
        return arr[amount];
    }
        return -1;
    }
}