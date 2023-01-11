//Link To Question : https://practice.geeksforgeeks.org/problems/largest-subtree-sum-in-a-tree/1

class Solution {
    public static int findLargestSubtreeSum(Node root) {
        int res[] = new int[1];
        res[0] = Integer.MIN_VALUE;
        solve(root,res);
        return res[0];
    }

    static int solve(Node root,int[] res){
        if(root == null) return 0;

        int left = solve(root.left,res);
        int right = solve(root.right,res);

        res[0] = Math.max(res[0],left + right + root.data);

        return root.data +left + right;
    }
}
