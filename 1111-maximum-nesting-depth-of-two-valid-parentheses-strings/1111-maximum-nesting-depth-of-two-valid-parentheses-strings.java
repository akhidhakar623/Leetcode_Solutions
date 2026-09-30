class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int[] arr = new int[seq.length()];
        Stack<Character> st = new Stack<>();
        for(int i =0;i<seq.length();i++){
            char ch = seq.charAt(i);
            if(ch == '('){
               st.push(ch);
                arr[i] = st.size() % 2;
            }
            else{
                arr[i] = st.size()%2;
                st.pop();
            }
        }
        return arr;
    }
}