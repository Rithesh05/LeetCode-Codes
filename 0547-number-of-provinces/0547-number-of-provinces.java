class Solution {
    static boolean vis[];
    private void dfs(int curr,ArrayList<ArrayList<Integer>> adj){
        Stack<Integer> st=new Stack<>();
        st.push(curr);
        vis[curr]=true;
        while(!st.isEmpty()){
            int c=st.pop();
            for(int i=0;i<adj.get(c).size();i++){
                if(!vis[adj.get(c).get(i)]){
                    st.push(adj.get(c).get(i));
                    vis[adj.get(c).get(i)]=true;
                }
            }
        }
    }
    public int findCircleNum(int[][] mat) {
        int count=0;
        vis=new boolean[mat.length];
        //converting to list
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<mat.length;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(mat[i][j]==1){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        for(int i=0;i<mat.length;i++){
            if(!vis[i]){
                count++;
                dfs(i,adj);
            }
        }
        return count;
    }
}