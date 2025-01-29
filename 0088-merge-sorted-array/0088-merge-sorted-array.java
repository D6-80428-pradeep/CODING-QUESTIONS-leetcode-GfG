class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Start from the end of both arrays
        int p1 = m - 1;    // Last element of nums1
        int p2 = n - 1;    // Last element of nums2
        int p = m + n - 1; // Last position in nums1
        
        // While there are elements to compare in both arrays
        while (p2 >= 0) {
            // If p1 >= 0 and nums1 element is larger, put it at the end
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                // Otherwise put nums2 element at the end
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }
    }
}