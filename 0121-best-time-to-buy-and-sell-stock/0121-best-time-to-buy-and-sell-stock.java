class Solution {
    public int maxProfit(int[] prices) {
        int t=Integer.MAX_VALUE;
        int ans=0;
        int curr=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<t) t=prices[i];

            curr=prices[i]-t;
            if(ans<curr) ans=curr;
        }
        return ans;
    }
}