class Solution {
    public int minOperations(int[] nums, int k) {
      PriorityQueue<Long> heap = new PriorityQueue<>();
        for (int num : nums) {
            heap.add((long) num);
        }
        
        int count = 0;
        while (heap.peek() < k) {
            if (heap.size() < 2) {
                return -1;
            }
            long x = heap.poll();
            long y = heap.poll();
            long newVal = x * 2 + y;
            heap.add(newVal);
            count++;
        }
        return count;
    }
}