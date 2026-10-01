class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int[] result = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i =arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[i]>=arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                st.push(i);
                result[i] =0;
            }
            else{
                result[i] = st.peek()-i;
                st.push(i);
            }
        }
        return result;
        
    }
}