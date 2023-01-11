//Link To Question: https://practice.geeksforgeeks.org/problems/sum-tree/1

class Solution{
    boolean flag = true;
    boolean isSumTree(Node root){
        postOrder(root);
        return flag;
    }

    int postOrder(Node root){
        if(root==null)
            return 0;

        if(root.left==null && root.right==null)
            return root.data;

        int leftSum = postOrder(root.left);
        int rightSum = postOrder(root.right);

        if(leftSum+rightSum != root.data)
            flag=false;

        return leftSum+rightSum+root.data;
    }
}
