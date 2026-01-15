/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
 class Pair{
    TreeNode root;
    int h;
    Pair(TreeNode root,int h){
        this.root=root;
        this.h=h;
    }
 }
class Solution {
    int max=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
    void dfs(TreeNode root,HashMap<Integer,Integer> map){
        if(root==null) return;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root,1));
        while(!q.isEmpty()){
            Pair curr=q.poll();
            TreeNode cn=curr.root;
            int h=curr.h;
            max=Math.max(max,h);
            min=Math.min(min,h);
            //check exists
            if(!map.containsKey(h)){
                map.put(h,cn.val);
            }
            //traversal
            if(cn.right!=null){
                q.add(new Pair(cn.right,h+1));
            }
                if(cn.left!=null) q.add(new Pair(cn.left,h+1));
        }
    }
    public List<Integer> rightSideView(TreeNode root) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        map.put(0,root.val);
        max=Math.max(max,0);
        min=Math.min(min,0);
        dfs(root.right,map);
        dfs(root.left,map);
        for(int i=min;i<=max;i++){
            ans.add(map.get(i));
        }
        return ans;
    }
}