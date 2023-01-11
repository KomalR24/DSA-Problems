//Link To Question: https://practice.geeksforgeeks.org/problems/mirror-tree/1

class Solution {

    Node doMirror(Node node){
        if(node==null) return null;
        Node left = doMirror(node.left);
        Node right = doMirror(node.right);
        node.right = left;
        node.left = right;
        return node;
    }
    void mirror(Node node) {
        doMirror(node);

    }
}