class Solution {
    public int islandPerimeter(int[][] grid) {
        int sum=0;
        int row=grid.length;
        int col=grid[0].length;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    sum=sum+4;
                
                //top
                if((i-1)>=0 && (i-1)<row && grid[i-1][j]==1 ){
                    sum=sum-1;
                }
                //bottom
                if((i+1)>=0 && (i+1)<row && grid[i+1][j]==1){
                    sum=sum-1;
                }
                //right
                if((j+1)>=0 && (j+1)<col && grid[i][j+1]==1){
                    sum=sum-1;
                }
                //left
                if((j-1)>=0 && (j-1)<col && grid[i][j-1]==1){
                    sum=sum-1;
                }
                }
            }
        }
        return sum;
    }
}