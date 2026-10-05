class Solution {
    public int[] sortedSquares(int[] arr) {
        int n = arr.length;
        int i = n;
        int[] ar = new int[n];
        for(int x =0;x<n;x++){
            if(arr[x] >=0){
                i = x;
                break;
            }
        }
        int j =i-1;
        int add =0;
        while(j>=0 && i<n){
            if((arr[i]*arr[i]) <=(arr[j]*arr[j])){
                ar[add] = (arr[i]*arr[i]);
                add++;
                i++;
            }
            else {
                ar[add] = (arr[j]*arr[j]);
                add++;
                j--;
            }

        }
        while (j>=0){
            ar[add] = arr[j]*arr[j];
            add++;
            j--;
        }
        while (i<n){
            ar[add] = arr[i]*arr[i];
            add++;
            i++;
        }
        return ar;
        
    }
}