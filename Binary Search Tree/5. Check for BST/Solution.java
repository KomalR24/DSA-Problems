//Link To Question : https://practice.geeksforgeeks.org/problems/check-for-bst/1

class Solution
{
    boolean isBST(Node root)
    {
        if(root==null){
            return false;
        }
        ArrayList<Integer> al=new ArrayList<Integer>();
        inOrder(root,al);
        for(int i=0;i<al.size()-1;i++){
            if(al.get(i)>al.get(i+1))
                return false;
        }
        return true;
    }
    public void inOrder(Node root,ArrayList<Integer>al){
        if(root==null){
            return;
        }
        inOrder(root.left,al);
        al.add(root.data);
        inOrder(root.right,al);
    }
}