public class Solution {
    public bool ContainsDuplicate(int[] nums) {

        Dictionary<int,int> number= new Dictionary<int,int>();
        foreach(int num in nums){
            if(number.ContainsKey(num)){
                return true;
            }
            number[num]=1;
        }
        return false;
        
    }
}