class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum=0;
        int d=x;
        int l=Integer.toString(x).length();
        for(int i=0;i<l;i++){
            sum+=x%10;
            x/=10;
        }
        
        if(d%sum==0){
        return sum;
        }
        return -1;
    }
}