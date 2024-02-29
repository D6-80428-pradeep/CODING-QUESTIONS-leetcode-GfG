class Solution {
    public boolean symm(int num){
        int l=Integer.toString(num).length();
        if(l%2!=0) return false;
        int t=num;
        int sum1=0;
        int sum2=0;
         
        for(int i=l-1;i>=0;i--){
            if(i>=l/2){
            sum1+=t%10;
            t=t/10;
            }else{
                sum2+=t%10;
                t/=10;
            } 
        }
        if(sum1!=sum2) return false; 
        return true;
    }
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++){
            if(symm(i)){
                count++;
            }
        }
        return count;
    }
}