// Link To Question: https://practice.geeksforgeeks.org/problems/flatten-binary-tree-to-linked-list/1

class Solution
{
    public static void flatten(Node root)
    {
        Node curr = root;
        while(curr != null){
            if(curr.left != null){
                Node pred = curr.left;
                while(pred.right != null){
                    pred = pred.right;
                }
                pred.right = curr.right;
                curr.right = curr.left;
            }
            curr = curr.right;
        }

        curr = root;
        while(curr != null){
            curr.left = null;
            curr = curr.right;
        }
    }
}