// Link To Question: https://practice.geeksforgeeks.org/problems/find-k-th-smallest-element-in-bst/1

class Solution {

    int count = 0;
    int ans = -1;

    public void inorder(Node root, int k) {
        if (root.left != null) {
            inorder(root.left, k);
        }
        count++;
        if (count == k) {
            ans = root.data;
            return;
        }
        if (root.right != null) {
            inorder(root.right, k);
        }
    }

    public int KthSmallestElement(Node root, int k) {

        inorder(root, k);
        return ans;
    }
}