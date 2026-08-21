class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        permutation(nums, 0, curr, ans);
        return ans;
    }
    public void permutation(int[] nums, int idx,List<Integer> curr,List<List<Integer>> ans) {
        if (idx == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        for (int i = 0; i <= curr.size(); i++) {
            curr.add(i, nums[idx]);
            permutation(nums, idx + 1, curr, ans);
            curr.remove(i);
        }
    }
}