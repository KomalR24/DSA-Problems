// Link To Question: https://practice.geeksforgeeks.org/problems/delete-a-node-from-bst/1

class Solution {

    public static Node getSucc(Node root){
        Node curr=root.right;
        while(curr.left!=null){
            curr=curr.left;
        }
        return curr;
    }

    public static Node deleteNode(Node root, int X) {

        if(root==null) return null;
        if(root.data<X) root.right = deleteNode(root.right,X);
        else if(root.data>X) root.left = deleteNode(root.left,X);
        else{
            if(root.left==null) return root.right;
            else if(root.right==null) return root.left;
            else{
                Node succ = getSucc(root);
                root.data = succ.data;
                root.right = deleteNode(root.right,succ.data);
            }
        }
        return root;
    }
}