//Link To Question : https://practice.geeksforgeeks.org/problems/preorder-to-postorder4423/1

class Solution {
    public static Node post_order(int[] pre, int size) {
        if (size == 0) return null;
        Node root = new Node(pre[0]);
        if (size == 1) return root;
        helper(pre, size, 1, root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return root;
    }

    public static int helper(int[] pre, int size, int idx, Node root, int low, int high) {

        if (size == idx || pre[idx] < low || pre[idx] > high) return idx;
        if (pre[idx] < root.data) {
            root.left = new Node(pre[idx]);
            idx++;
            idx = helper(pre, size, idx, root.left, low, root.data - 1);
        }
        if (size == idx || pre[idx] < low || pre[idx] > high) return idx;

        root.right = new Node(pre[idx]);
        idx++;
        idx = helper(pre, size, idx, root.right, root.data + 1, high);
        return idx;
    }
}