// Link To Question: https://practice.geeksforgeeks.org/problems/binary-tree-to-bst/1

class Solution
{
    int i=0;
    Node binaryTreeToBST(Node root)
    {
        ArrayList<Integer> al = new ArrayList<>();
        inorder(root,al);
        Collections.sort(al);
        makeBst(root,al);
        return root;
    }

    void inorder(Node root, ArrayList<Integer> al){
        if(root==null) return;
        inorder(root.left,al);
        al.add(root.data);
        inorder(root.right,al);
    }

    void makeBst(Node root, ArrayList<Integer> al){
        if(root==null) return;
        makeBst(root.left,al);
        root.data = al.get(i);
        i++;
        makeBst(root.right,al);
    }
}