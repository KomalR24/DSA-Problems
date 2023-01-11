//Link To Question: https://practice.geeksforgeeks.org/problems/binary-tree-to-dll/1

class Solution
{
    Node prev=null,head=null;

    Node bToDLL(Node root)
    {
        if(root==null) return root;
        bToDLL(root.left);
        if(prev==null) head=root;
        else{
            prev.right=root;
            root.left=prev;
        }
        prev=root;
        bToDLL(root.right);
        return head;
    }
}