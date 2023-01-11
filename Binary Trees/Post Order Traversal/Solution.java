//Link To Question: https://practice.geeksforgeeks.org/problems/postorder-traversal/1

class Solution
{
    ArrayList<Integer> postOrder(Node root)
    {
        ArrayList<Integer> al = new ArrayList<>();
        postorder(root,al);
        return al;
    }

    void postorder(Node root, ArrayList<Integer> al){
        if(root==null) return;
        postorder(root.left,al);
        postorder(root.right,al);
        al.add(root.data);
    }
}