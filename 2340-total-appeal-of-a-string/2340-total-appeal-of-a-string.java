class Solution {
    public long appealSum(String s) {
            long result = 0;
        int[] lastPos = new int[26];
        Arrays.fill(lastPos, -1);
        
        for (int i = 0; i < s.length(); i++) {
            int currentChar = s.charAt(i) - 'a';
            // Cast to long before multiplication to prevent integer overflow
            result += (long)(i - lastPos[currentChar]) * (long)(s.length() - i);
            lastPos[currentChar] = i;
        }
        
        return result;
    }
}