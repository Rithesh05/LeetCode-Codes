class Solution {
    public static boolean dfs(int curr,boolean[] vis,boolean[] pvis,int[][] graph){
        vis[curr]=true;
        pvis[curr]=true;
        for(int nei:graph[curr]){
            if(!vis[nei]){
                if(dfs(nei,vis,pvis,graph)==true)
                return true;
            }else{
                if(pvis[nei]==true){
                    return true;
                }
            }
        }
        pvis[curr]=false;
        return false;
    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        boolean vis[]=new boolean[graph.length];
        boolean pathvis[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                dfs(i,vis,pathvis,graph);
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<pathvis.length;i++){
            if(!pathvis[i]){
                list.add(i);
            }
        }
        return list;

    }
}
