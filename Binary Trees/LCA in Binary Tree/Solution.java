//Link To Question : https://practice.geeksforgeeks.org/problems/lowest-common-ancestor-in-a-binary-tree/1

class Solution
{
    Node lca(Node root, int a,int b)
    {
        if(root==null) return null;
        if(root.data==a || root.data==b) return root;
        Node lca1 =lca(root.left,a,b);
        Node lca2 = lca(root.right,a,b);

        if(lca1==null) return lca2;
        if(lca2==null) return lca1;
        return root;
    }
}