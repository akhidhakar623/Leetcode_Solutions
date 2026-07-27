class Solution {
    public int[][] generateMatrix(int n) {
        int [][] ans = new int[n][n];
       int i =0,a =n-1,j=0,b=n-1;
       int s =1;
       while( i <= a && j <= b){
               for(int x =j;x<=b;x++)
               ans[i][x]=s++;
               i++;
               if(i > a || j > b)
                break;
               
               for(int y =i;y<=a;y++)
               ans[y][b] = s++;
               b--;
               if(i > a || j > b)    
               break;
               
               for(int x =b;x>=j;x--)
               ans[a][x] = s++;
               a--;
               if(i > a || j > b)          
               break;
              
               for(int y =a;y>=i;y--)
               ans[y][j] = s++;
               j++;
               
       }
        return ans;
    }
}