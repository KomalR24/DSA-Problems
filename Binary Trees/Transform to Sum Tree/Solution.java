//Link To Question: https://practice.geeksforgeeks.org/problems/transform-to-sum-tree/1

class Solution{
    public void toSumTree(Node root){
        helper(root);
    }

    public int helper(Node root){
        if(root==null) return 0;

        if(root.right==null && root.left==null){
            int val = root.data;
            root.data=0;
            return val;
        }

        int left = helper(root.left);
        int right = helper(root.right);

        int temp = root.data;
        root.data = left+right;
        return temp + root.data;
    }
}