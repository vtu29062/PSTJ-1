class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;

        // Calculate total sum
        for (int num : nums) {
            total += num;
        }

        int leftSum = 0;

        for (int i = 0; i < nums.length; i++) {

            // Right sum = total - left sum - current element
            int rightSum = total - leftSum - nums[i];

            if (leftSum == rightSum) {
                return i;
            }

            leftSum += nums[i];
        }

        return -1;
    }
}
