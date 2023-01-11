//Link To Question: https://practice.geeksforgeeks.org/problems/check-for-balanced-tree/1

class Solution
{
    int balance(Node root){
        if(root==null) return 0;
        int lh = balance(root.left);
        if(lh==-1) return -1;
        int rh = balance(root.right);
        if(rh==-1) return -1;
        if(Math.abs(lh-rh)>1) return -1;
        else return Math.max(lh,rh) +1;
    }

    boolean isBalanced(Node root)
    {
        int t = balance(root);
        if(t==-1) return false;
        else return true;
    }
}