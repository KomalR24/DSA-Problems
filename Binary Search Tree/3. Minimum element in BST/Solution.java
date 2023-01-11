//Link To Question : https://practice.geeksforgeeks.org/problems/minimum-element-in-bst/1

class Tree {
    int minValue(Node root) {
        if(root==null) return -1;
        if(root.left==null) return root.data;
        return minValue(root.left);
    }
}

