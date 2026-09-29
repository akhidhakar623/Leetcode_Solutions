class Solution {
    public String minRemoveToMakeValid(String s) {

        char[] arr = s.toCharArray();
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == '(') {
                st.push(i);
            }
            else if (arr[i] == ')') {

                if (!st.isEmpty()) {
                    st.pop();
                }
                else {
                    arr[i] = '#';
                }
            }
        }

        while (!st.isEmpty()) {
            arr[st.pop()] = '#';
        }

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != '#') {
                ans.append(arr[i]);
            }
        }

        return ans.toString();
    }
}