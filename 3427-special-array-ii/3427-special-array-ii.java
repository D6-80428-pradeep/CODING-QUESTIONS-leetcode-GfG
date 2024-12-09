class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n = nums.length;
        if (n == 1) {
            boolean[] result = new boolean[queries.length];
            for (int i = 0; i < queries.length; i++) {
                result[i] = true;
            }
            return result;
        }
        int[] same = new int[n];
        for (int i = 1; i < n; i++) {
            same[i] = same[i - 1] + ((nums[i] % 2) == (nums[i - 1] % 2) ? 1 : 0);
        }

        boolean[] result = new boolean[queries.length];
         int k=0;
        for (int [] ans:queries) {
            int from = ans[0];
            int to = ans[1];
            int sameParityCount = same[to] - same[from];
            result[k++] = (sameParityCount == 0);
        }

        return result;
    }
}