// Link To Question: https://practice.geeksforgeeks.org/problems/kth-largest-element-in-bst/1

class Solution
{
    public void inOrder(Node root, ArrayList<Integer> al){
        if(root!=null){
            inOrder(root.left,al);
            al.add(root.data);
            inOrder(root.right,al);
        }
    }
    public int kthLargest(Node root,int K)
    {
        ArrayList<Integer> al = new ArrayList<>();
        inOrder(root,al);
        return al.get(al.size()- K);

    }
}