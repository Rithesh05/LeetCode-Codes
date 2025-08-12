class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        //making arrayList
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        //find indeg
        int[] indeg=new int[numCourses];
        int[] ans=new int[numCourses];
        //Queue for toposort
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
            int dest=prerequisites[i][0];
            int src=prerequisites[i][1];
            adj.get(src).add(dest);
            indeg[dest]++;
        }
        //add all indegree zeros in queue
        for(int i=0;i<indeg.length;i++){
            if(indeg[i]==0){
                q.add(i);
            }
        }
        int j=0;
        while(!q.isEmpty()){
            int curr=q.poll();
            ans[j]=curr;
            for(int neigh:adj.get(curr)){
                indeg[neigh]--;
                if(indeg[neigh]==0){
                    q.add(neigh);
                }
            }
            j++;
        }
        if(j==ans.length){
           return ans; 
        }

        return new int[]{};
    }
}