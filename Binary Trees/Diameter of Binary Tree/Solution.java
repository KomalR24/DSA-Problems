//Link To Question: https://practice.geeksforgeeks.org/problems/diameter-of-binary-tree/1

class Solution {
    int res = 0;
    int height(Node root){
        if(root==null) return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        res = Math.max(lh+rh+1,res);
        return 1+ Math.max(lh,rh);
    }

    int diameter(Node root){
        height(root);
        return res;
    }
}