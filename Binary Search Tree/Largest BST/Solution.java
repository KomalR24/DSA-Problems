// Link To Question: https://practice.geeksforgeeks.org/problems/largest-bst/1

class Solution{
    static boolean check(Node node, int min, int max)
    {
        if (node == null)
            return true;
        if (node.data < min || node.data > max)
            return false;
        return (check(node.left, min, node.data-1) &&
                check(node.right, node.data+1, max));
    }
    static int count(Node root){
        if(root==null)
            return 0;
        return 1+count(root.left)+count(root.right);
    }
    static void solve(Node root,int a[]){
        if(root==null)
            return;

        if(check(root,Integer.MIN_VALUE,Integer.MAX_VALUE))
            a[0]=Math.max(a[0],count(root));

        solve(root.left,a);
        if(check(root,Integer.MIN_VALUE,Integer.MAX_VALUE))
            a[0]=Math.max(a[0],count(root));
        solve(root.right,a);
        if(check(root,Integer.MIN_VALUE,Integer.MAX_VALUE))
            a[0]=Math.max(a[0],count(root));
    }

    static int largestBst(Node root)
    {
        int res=0;
        if(root==null)
            return 0;
        if(root.left==null && root.right==null)
            return 1;

        int arr[]=new int[1];
        arr[0]=0;
        solve(root,arr);
        res=arr[0];

        return res;
    }
}