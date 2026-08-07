class Solution {
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        if(n<=1) return nums;
        int [] a =new int[n/2];
        int [] b =new int[n-n/2];
        int idx =0;
        for(int i=0;i<a.length;i++){
            a[i] =nums[idx++];
        }
        for(int j=0;j<b.length;j++){
               b[j] = nums[idx++]; 
        }
        sortArray(a);
        sortArray(b);
        merge(a,b,nums);

        return nums;
    }
    
    public void merge(int[] a,int[] b,int[] c){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
           if(a[i]<=b[j]) c[k++] = a[i++];
           else{
            c[k++] = b[j++];
           }
        }
        while(i<a.length){
            c[k++] =a[i++];
        }
        while(j<b.length){
            c[k++] =b[j++];
        }
    }
    
}