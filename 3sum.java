class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        // Sort the array to make it easier to avoid duplicates and use the two-pointer approach
        Arrays.sort(nums);

        // Iterate through the array
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate elements to avoid duplicate triplets
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // Two-pointer approach to find the other two numbers
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    // If the sum is zero, add the triplet to the result
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Move the left pointer to the right, skipping duplicates
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    // Move the right pointer to the left, skipping duplicates
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    // Move both pointers inward after finding a valid triplet
                    left++;
                    right--;
                } else if (sum < 0) {
                    // If the sum is less than zero, move the left pointer to the right to increase the sum
                    left++;
                } else {
                    // If the sum is greater than zero, move the right pointer to the left to decrease the sum
                    right--;
                }
            }
        }

        return result;
    }
}

    
