//Link To Question : https://practice.geeksforgeeks.org/problems/min-distance-between-two-given-nodes-of-a-binary-tree/1

class Solution {
    int findDist(Node root, int a, int b) {
        Node LCA = lca(root, a,b);
        int x = distance(LCA,a);
        int y = distance(LCA,b);
        return x+y-2;
    }

    Node lca(Node root, int a , int b){
        if(root==null || root.data==a || root.data==b) return root;
        Node lca1 = lca(root.left,a,b);
        Node lca2 = lca(root.right,a,b);
        if(lca1==null) return lca2;
        if(lca2==null) return lca1;
        return root;
    }

    int distance(Node root, int a){
        if(root==null) return 0;
        if(root.data==a) return 1;
        int left = distance(root.left,a);
        int right = distance(root.right,a);
        if(left==0 && right==0) return 0;
        return left+right+1;
    }
}