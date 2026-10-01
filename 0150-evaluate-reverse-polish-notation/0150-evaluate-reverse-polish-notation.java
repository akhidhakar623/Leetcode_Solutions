
class Solution {
    public int evalRPN(String[] s) {
            Stack<Integer> st = new Stack<>();
            for(int i =0;i<s.length;i++){
                String ch = s[i];
                if(ch.equals("+")){
                    int a = st.pop();
                    int b = st.pop();
                    st.push(a+b);
                }
                else if(ch.equals("-")){
                    int a = st.pop();
                    int b = st.pop();
                    st.push(b-a);
                }
                else if(ch.equals("*")){
                    int a = st.pop();
                    int b = st.pop();
                    st.push(a*b);
                }
                else if(ch.equals("/")){
                    int a = st.pop();
                    int b = st.pop();
                    st.push(b/a);
                }
                else{
                    st.push(Integer.parseInt(s[i]));
                }
            }
            return st.peek();   
    }
}
