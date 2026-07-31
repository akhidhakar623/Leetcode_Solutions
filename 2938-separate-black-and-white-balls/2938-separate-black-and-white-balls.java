class Solution {
    public long minimumSteps(String s) {
    long swaps = 0;
    long ones = 0;

    for (int i = 0; i < s.length(); i++) {
       if (s.charAt(i) == '1') {
        ones++;
        }
        else {
        swaps += ones;
        }
      }
      return swaps;
    }
}