//Link To Question : https://practice.geeksforgeeks.org/problems/kth-ancestor-in-a-tree/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article

class Solution{
    ArrayList<Integer> adj;
    public boolean path(Node root, int target){
        if(root==null) return false;
        if(root.data == target) return true;

        boolean left = path(root.left, target);
        if(left){
            adj.add(root.data);
            return true;
        }
        boolean right = path(root.right, target);
        if(right){
            adj.add(root.data);
            return true;
        }
        return false;
    }

    public int kthAncestor(Node root, int k, int node){
        adj = new ArrayList<>();
        boolean find = path(root,node);
        if(find && adj.size()>=k){
            return adj.get(k-1);
        }
        return -1;
    }
}