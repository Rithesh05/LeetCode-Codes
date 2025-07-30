class Pair{
    int r;
    int c;
    int t;
    Pair(int r, int c, int t){
        this.r=r;
        this.c=c;
        this.t=t;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<Pair> q=new LinkedList<>();
        //add all rotten into queue
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i,j,0));
                }
            }
        }
        //top right left bottom positions
        int[] dr={-1,1,0,0};
        int[] dc={0,0,1,-1};
        int time=0;
        //bfs
        while(!q.isEmpty()){
            Pair curr=q.poll();
            for(int i=0;i<4;i++){
                int nr=curr.r+dr[i];
                int nc=curr.c+dc[i];
                int nt=curr.t+1;
                if(nr>=0 && nc>=0 && nr<grid.length && nc<grid[0].length && grid[nr][nc]==1){
                   grid[nr][nc]=2;
                   q.add(new Pair(nr,nc,nt));
                   time=Math.max(time,nt); 
                }
            }

        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    return -1;
                }
            }
        }
        return time;
    }
}