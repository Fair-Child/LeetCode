class Solution {
    public int minimumSwaps(int[] nums) {
        int minIndex = 0, maxIndex = 0;
        int minValue = Integer.MAX_VALUE, maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (minValue > nums[i]) {
                minValue = nums[i];
                minIndex = i;
            }
            if (maxValue <= nums[i]) {
                maxValue = nums[i];
                maxIndex = i;
            }
        }

        return minIndex > maxIndex ? (minIndex + (nums.length - 1) - maxIndex - 1) : (minIndex + (nums.length - 1) - maxIndex);
   }
}