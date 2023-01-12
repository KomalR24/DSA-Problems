// Link To Question: https://practice.geeksforgeeks.org/problems/merge-two-bst-s/1

class Solution //(Naive)
{
    void  inorder(Node root, ArrayList<Integer> al){
        if(root==null){
            return ;
        }
        inorder(root.left, al);
        al.add(root.data);
        inorder(root.right, al);
        return;
    }
    public List<Integer> merge(Node root1,Node root2)
    {
        ArrayList<Integer> al = new ArrayList<>();
        inorder(root1,al);
        inorder(root2,al);
        Collections.sort(al);
        return al;
    }
}