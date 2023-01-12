// Link To Question: https://practice.geeksforgeeks.org/problems/search-a-node-in-bst/1

class Solution {
    boolean search(Node root, int x) {
        while(root!=null){
            if(root.data==x) return true;
            else if(root.data<x) return search(root.right,x);
            else return search(root.left,x);
        }
        return false;
    }
}