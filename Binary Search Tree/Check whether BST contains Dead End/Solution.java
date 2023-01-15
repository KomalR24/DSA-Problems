// Link To Question: https://practice.geeksforgeeks.org/problems/check-whether-bst-contains-dead-end/1

class Solution
{
    public static boolean helper(Node root, int l, int u){
        if(root==null) return false;
        if(l==u) return true;
        return helper(root.left,l,root.data-1) || helper(root.right,root.data+1,u);
    }
    public static boolean isDeadEnd(Node root)
    {
        return helper(root,1,Integer.MAX_VALUE);
    }
}
