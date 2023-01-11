//Link To Question: https://practice.geeksforgeeks.org/problems/inorder-traversal/1

class Solution {

    ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> al = new ArrayList<>();
        inorder(root,al);
        return al;
    }

    public void inorder(Node root, ArrayList<Integer> al){
        if(root==null) return;
        inorder(root.left,al);
        al.add(root.data);
        inorder(root.right,al);
    }
}