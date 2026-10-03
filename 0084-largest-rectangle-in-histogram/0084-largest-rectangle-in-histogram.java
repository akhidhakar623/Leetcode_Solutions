class Solution {
    public int largestRectangleArea(int[] arr) {
        int n = arr.length;
        int[] nse = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i =n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nse[i] = n;
            }
            else{
                 nse[i] = st.peek();
            }
            st.push(i);
        }

        while(st.size()>0) st.pop();

        int[] pse =new int[n]; 
        for(int i =0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                pse[i] = -1;
            }
            else{
                 pse[i] = st.peek();
            }
            st.push(i);
            
        }

        int maxArea =0;
        for(int i =0;i<n;i++){
            int area = arr[i] *(nse[i] - pse[i]-1);
            maxArea = Math.max(area,maxArea);
        }
        return maxArea;
    }
}