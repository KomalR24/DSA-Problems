// Link To Question: https://practice.geeksforgeeks.org/problems/lowest-common-ancestor-in-a-bst/1

class Solution
{
    Node LCA(Node root, int n1, int n2)
    {
        // code here.
        if(n1<root.data && n2<root.data) return LCA(root.left,n1,n2);
        else if(n1>root.data && n2>root.data) return LCA(root.right,n1,n2);
        else return root;
    }
}