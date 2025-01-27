class Solution {
    public long appealSum(String s) {
             long totalAppeal = 0;
        int n = s.length();
        Map<Character, Integer> lastOccurrence = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            char currentChar = s.charAt(i);
            // Calculate the number of substrings where currentChar is the first occurrence
            int lastIndex = lastOccurrence.getOrDefault(currentChar, -1);
            // Use long for the calculation to avoid overflow
            totalAppeal += (long) (i - lastIndex) * (n - i);
            // Update the last occurrence of currentChar
            lastOccurrence.put(currentChar, i);
        }
        
        return totalAppeal;
    }
}