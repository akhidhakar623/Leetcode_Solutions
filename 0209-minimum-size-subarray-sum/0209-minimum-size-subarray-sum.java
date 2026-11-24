class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int l = 0 ;
        int r =0;
        int minlength = Integer.MAX_VALUE;
        int sum =0;
        while(r<n){
            if(sum < target){
                sum = sum+nums[r];
                r++;
            }
            while(sum >= target){
                minlength = Math.min(minlength,r-l);
                sum = sum-nums[l];
                l++;
            }
        }
        if(minlength == Integer.MAX_VALUE){
            return 0;
        }
        else return minlength;
    }
}