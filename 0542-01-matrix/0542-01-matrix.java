class Pair{
    int r;
    int c;
    int d;
    Pair(int r,int c,int d){
        this.r=r;
        this.c=c;
        this.d=d;
    }
}
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        Queue<Pair> q=new LinkedList<>();
        int row=mat.length;
        int col=mat[0].length;
        boolean[][] vis=new boolean[row][col];
        //add all zeros
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j]==0){
                    q.add(new Pair(i,j,0));
                    vis[i][j]=true;
                }
            }
        }
        int[] dr={-1,0,1,0};
        int[] dc={0,1,0,-1};
        while(!q.isEmpty()){
            Pair curr=q.poll();
            for(int i=0;i<4;i++){
            int cr=curr.r+dr[i];
            int cc=curr.c+dc[i];
            int cd=curr.d+1;
            if(cr>=0 && cc>=0 && cr<row && cc<col && !vis[cr][cc]){
                vis[cr][cc]=true;
                mat[cr][cc]=cd;
                q.add(new Pair(cr,cc,cd));
            }
            }
        }
        return mat;
    }
}