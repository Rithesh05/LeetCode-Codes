class Pair{
    int r;
    int c;
    Pair(int r,int c){
        this.r=r;
        this.c=c;
    }
}
class Solution {
    public void solve(char[][] board) {
        Queue<Pair> q = new LinkedList<>();
        int row=board.length;
        int col=board[0].length;
        boolean[][] vis = new boolean[row][col];

        // top line
        for (int i = 0; i < col; i++) {
            if (board[0][i] == 'O' && !vis[0][i]) {
                q.add(new Pair(0, i));
                vis[0][i] = true;
            }
        }

        // bottom line
        for (int i = 0; i < col; i++) {
            if (board[row - 1][i] == 'O' && !vis[row - 1][i]) {
                q.add(new Pair(row - 1, i));
                vis[row - 1][i] = true;
            }
        }

        // left line
        for (int i = 0; i < row; i++) {
            if (board[i][0] == 'O' && !vis[i][0]) {
                q.add(new Pair(i, 0));
                vis[i][0] = true;
            }
        }

        // right line
        for (int i = 0; i < row; i++) {
            if (board[i][col - 1] == 'O' && !vis[i][col - 1]) {
                q.add(new Pair(i, col - 1));
                vis[i][col - 1] = true;
            }
        }
        int[] dr={-1,0,1,0};
        int[] dc={0,1,0,-1};
        while(!q.isEmpty()){
            Pair curr=q.poll();
            for(int i=0;i<4;i++){
               int cr=curr.r+dr[i];
               int cc=curr.c+dc[i];
               if(cr>=0 && cc>=0 && cr<row && cc<col && board[cr][cc]=='O' && !vis[cr][cc]){
                    vis[cr][cc]=true;
                    q.add(new Pair(cr,cc));
               }
            }            
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(!vis[i][j]){
                    board[i][j]='X';
                }
            }
        }
    }
}