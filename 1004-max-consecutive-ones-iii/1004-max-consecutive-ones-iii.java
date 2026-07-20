class Solution {
    public int longestOnes(int[] nums, int k) {
       int i = 0, j = 0;
        
        while (j < nums.length) {
            // If we encounter a 0, we consume a flip
            if (nums[j] == 0) {
                k--;
            }
            // If we ran out of flips, shift the left pointer forward
            if (k < 0) {
                if (nums[i] == 0) {
                    k++; // Recover the flip as the 0 leaves the window
                }
                i++; // Shift window right without shrinking its size
            }
            j++;
        }
        // The maximum window size is exactly the distance between j and i
        return j - i;
    }
}