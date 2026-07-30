class Solution {
    public boolean canMakeSquare(char[][] grid) {
        int m =grid.length;
        int n =grid[0].length;
        for(int i=0;i<m-1;i++){
            for(int j=0;j<n-1;j++){
                int count =0;
                int count2 =0;

                for(int x =i;x<i+2;x++){
                    for(int y=j;y<j+2;y++){
                        if(grid[x][y] =='W') count++;
                        else count2++;
            }
                         
                }
                 if(count>=3 || count2>=3) return true;
                    }
                   
                
        }
        return false;
    }
}