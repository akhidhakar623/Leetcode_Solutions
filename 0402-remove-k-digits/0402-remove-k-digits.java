class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        int n = num.length();
        int count = 0;
        for(int i =0;i<n;i++){
            char ch = num.charAt(i);
            while(count < k && !st.isEmpty() && st.peek() > ch){
                 count++;
                 st.pop();
            }
                st.push(ch);
        }

         while(count < k) {
            st.pop();
            count++;
        }
        StringBuilder ans = new StringBuilder();

        while (!st.isEmpty()) {
            ans.append(st.pop());
        }
        ans.reverse();
        if(ans.length() == 0) {
           return "0";
        }
        while(ans.length() > 1 && ans.charAt(0) == '0') {
           ans.deleteCharAt(0);
        }

        return ans.toString();


    }
}