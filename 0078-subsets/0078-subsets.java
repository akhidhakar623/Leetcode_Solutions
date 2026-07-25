class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        subset(nums,0,ans,curr);
        return ans;
    }
    public void subset(int[] nums,int idx,List<List<Integer>> ans,List<Integer> curr ){
        if(idx==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[idx]);
        subset(nums,idx+1,ans,curr);
        curr.remove(curr.size() - 1);
        subset(nums,idx+1,ans,curr);



    }
    
}
