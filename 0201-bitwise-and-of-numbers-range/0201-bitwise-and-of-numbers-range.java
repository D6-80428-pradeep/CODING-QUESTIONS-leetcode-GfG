class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int count=0;
        while(left!=right){
            left=left>>1;
            right=right>>1;
            count++;
        }
        System.out.println(count);
        return (left<<count);
    }
}