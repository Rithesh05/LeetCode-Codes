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
    int h;
    TreeNode node;
    Pair(TreeNode node,int h){
        this.node=node;
        this.h=h;
    }
}
class Solution {
    public int amountOfTime(TreeNode root, int start) {
        HashMap<TreeNode,TreeNode> map=new HashMap<>();
        if(root==null) return 0;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        TreeNode stnode=null;
        //parent child mapping
        while(!q.isEmpty()){
            TreeNode curr=q.poll();
            if(curr.val==start) stnode=curr;
            if(curr.right!=null){
                map.put(curr.right,curr);
                q.add(curr.right);
            }
            if(curr.left!=null){
                map.put(curr.left,curr);
                q.add(curr.left);
            }
        }
        int ans=0;
        Queue<Pair> q1=new LinkedList<>();
        Set<TreeNode> set=new HashSet<>();
        q1.add(new Pair(stnode,0));
        while(!q1.isEmpty()){
            Pair curr=q1.poll();
            TreeNode cn=curr.node;
            int ch=curr.h;
            ans=Math.max(ch,ans);
            if(set.contains(cn)) continue;
            set.add(cn);
            if(cn.left!=null && !set.contains(cn.left)) q1.add(new Pair(cn.left,ch+1));
            if(cn.right!=null && !set.contains(cn.right)) q1.add(new Pair(cn.right,ch+1));
            if(map.containsKey(cn)){
                if(!set.contains(map.get(cn))){
                    q1.add(new Pair(map.get(cn),ch+1));
                }
            }
        }
        return ans;
    }
}