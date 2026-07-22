class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int i = 0;                      // left pointer
        int j = numbers.length - 1;     // right pointer

        while (i < j) {

            int sum = numbers[i] + numbers[j];

            if (sum > target) {
                j--;                    // move right pointer left
            } else if (sum < target) {
                i++;                    // move left pointer right
            } else {
                return new int[]{i + 1, j + 1};   // return 1-based indices
            }
        }

        return new int[]{};
    }
}