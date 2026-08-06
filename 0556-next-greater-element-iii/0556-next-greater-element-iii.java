class Solution {
    public int nextGreaterElement(int n) {

        char[] nums = Integer.toString(n).toCharArray();
        int len = nums.length;

        // Find pivot
        int pivot = -1;
        for (int i = len - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        // No next greater permutation
        if (pivot == -1) {
            return -1;
        }

        // Find next greater element
        for (int i = len - 1; i > pivot; i--) {
            if (nums[i] > nums[pivot]) {
                swap(nums, i, pivot);
                break;
            }
        }

        // Reverse the suffix
        reverse(nums, pivot + 1, len - 1);

        // Convert char[] back to long
        long ans = Long.parseLong(new String(nums));

        // Overflow check
        if (ans > Integer.MAX_VALUE) {
            return -1;
        }

        return (int) ans;
    }

    public void swap(char[] nums, int i, int j) {
        char temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void reverse(char[] nums, int left, int right) {
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }
}