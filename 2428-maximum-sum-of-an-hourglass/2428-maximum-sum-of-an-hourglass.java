class Solution {
    public int maxSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int max = 0;
        for(int i =0;i<=m-3;i++){
            for(int j=0;j<=n-3;j++){
                int sum =0;
                for(int x =i;x<i+3;x++){
                    for(int y =j;y<j+3;y++){
                        if(x==i) sum+=grid[x][y];
                        if(x == i + 1 && y == j + 1) sum+= grid[x][y];
                        if(x == i+2) sum+=grid[x][y];
                    }
                    
                    
                }
                if(sum>max) max = sum;
            }
        }
        return max;
        
    }
}