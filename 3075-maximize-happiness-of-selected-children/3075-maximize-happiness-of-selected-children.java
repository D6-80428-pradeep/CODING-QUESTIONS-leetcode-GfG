
class Solution {
    public long maximumHappinessSum(int[] h, int k) {
        Arrays.sort(h);
        long s = 0;
        int cnt = 0;
        for (int i = h.length - 1; i >= h.length - k; i--) {
            s += Math.max(0, h[i] - cnt);
            cnt++;
        }
        return s;
    }
}