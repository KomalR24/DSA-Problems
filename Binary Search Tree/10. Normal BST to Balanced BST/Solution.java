//Link To Question : https://practice.geeksforgeeks.org/problems/normal-bst-to-balanced-bst/1

class Solution
{
    void inorder(Node root, ArrayList<Integer> al){
        if(root==null){
            return ;
        }
        inorder(root.left, al);
        al.add(root.data);
        inorder(root.right,al);
        return;
    }
    Node buildBalancedTree(Node root)  //main fn
    {
        if(root== null){
            return null;
        }
        ArrayList<Integer> al = new ArrayList<>();
        inorder(root,al);
        Node ans =inordertobst(al,0,al.size()-1);
        return ans;
    }
    Node inordertobst(ArrayList<Integer> al , int start, int end ){
        if(start>end){
            return null;
        }
        int mid = (start + end)/2;
        Node newnode = new Node(al.get(mid));
        newnode.left=inordertobst(al,start,mid-1);
        newnode.right=inordertobst(al,mid+1, end);
        return newnode;
    }
}