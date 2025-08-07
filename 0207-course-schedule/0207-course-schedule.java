class Solution {
    public boolean canFinish(int numc, int[][] prerequisites) {
        //using khans kada so need to find indegree
        int[] indeg=new int[numc];

        //converting mat to list
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numc;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
            int s=prerequisites[i][0];
            int c=prerequisites[i][1];
            adj.get(s).add(c);
            indeg[c]++;
        }
        int ans=0;

        //queue for khans algo
        Queue<Integer> q=new LinkedList<>();

        //add all elemnets in queue which have 0 in degree bcauz they can place safely first
        for(int i=0;i<numc;i++){
            if(indeg[i]==0){
                q.add(i);
            }
        }

        while(!q.isEmpty()){
            int curr=q.poll();
            ans++;
            for(int neighbour:adj.get(curr)){
                indeg[neighbour]--;
                if(indeg[neighbour]==0){
                    q.add(neighbour);
                }
            }
        }
        return ans==numc;
        
    }
}