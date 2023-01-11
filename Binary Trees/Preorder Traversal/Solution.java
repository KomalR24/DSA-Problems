//Link To Question: https://practice.geeksforgeeks.org/problems/preorder-traversal/1

class Solution
{
    static ArrayList<Integer> preorder(Node root)
    {
        ArrayList<Integer> al = new ArrayList<>();
        preOrder(root,al);
        return al;
    }

    static void preOrder(Node root, ArrayList<Integer> al){
        if(root==null) return;
        al.add(root.data);
        preOrder(root.left,al);
        preOrder(root.right,al);
    }
}