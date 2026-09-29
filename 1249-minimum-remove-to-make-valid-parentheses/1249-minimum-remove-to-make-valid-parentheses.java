class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder(s);
        Stack<Integer> st = new Stack<>();

        for(int i =0;i<sb.length();i++){
            char ch = s.charAt(i);
            if(ch =='('){
                st.push(i); // stack is store the adress of parenthesis 
            }
            else if(ch ==')'){
                if(!st.isEmpty()){
                    st.pop();
                }
                else{
                    sb.setCharAt(i,'#'); // if last elemnt is closing parenthesis then set kardo index par # 
                }
            }
        }

        while(!st.isEmpty()){
            sb.setCharAt(st.pop(),'#'); // bache hue parenthesis par bhi stringbuilder main usi index par # store kardo 
        }

        String ans = "";

        for(int i =0;i<sb.length();i++){
            if(sb.charAt(i) != '#'){ // last main agr # nahi hai to string main add karte jao
                ans+=sb.charAt(i);
            }
        }
        return ans;
    }
}