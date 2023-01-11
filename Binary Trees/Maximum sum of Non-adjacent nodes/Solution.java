//Link To Question : https://practice.geeksforgeeks.org/problems/maximum-sum-of-non-adjacent-nodes/1

class Solution
{
   static HashMap<Node , Integer> mp= new HashMap<>();
    static int getMaxSum(Node root)
    {
        if(root == null) return 0;
        if(mp.containsKey(root))
            return mp.get(root);
        int inc = root.data;
        int exc =0;
        if(root.left != null)
        {
            inc += getMaxSum(root.left.left);
            inc += getMaxSum(root.left.right);
        }
        if(root.right!=null)
        {
            inc += getMaxSum(root.right.left);
            inc += getMaxSum(root.right.right);
        }
        exc = getMaxSum(root.left)+getMaxSum(root.right);
        int ans  = Math.max(inc , exc);
        mp.put(root , ans);
        return ans;
    }
}