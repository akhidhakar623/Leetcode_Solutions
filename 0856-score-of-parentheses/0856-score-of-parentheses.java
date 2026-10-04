class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        int score = 0;
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch =='('){
                st.push(score);
                score = 0;
            }
            else{
                int last =st.pop();
                if(s.charAt(i-1) == '('){
                    score = last+1;
                }
                else{
                    score =  last +2 * score;
                }
            } 
        }
        return score;
    }
}