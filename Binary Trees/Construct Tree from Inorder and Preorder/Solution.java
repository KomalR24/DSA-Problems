//Link To Question: https://practice.geeksforgeeks.org/problems/construct-tree-1/1

class Solution
{
    public static Node buildTree(int inorder[], int preorder[], int n)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(inorder[i],i);
        }
        return helper(map, inorder,preorder,0,n-1,0,n-1);
    }

    public static Node helper(HashMap<Integer,Integer> map, int inorder[], int preorder[], int inStart, int inEnd, int preStart, int preEnd){
        if(inStart>inEnd || preStart>preEnd) return null;

        Node root = new Node(preorder[preStart]);

        int index = map.get(root.data);
        int numsLeft = index - inStart;

        root.left = helper(map,inorder,preorder,inStart,index-1,preStart+1,preStart+numsLeft);
        root.right = helper(map,inorder, preorder, index+1, inEnd, preStart+numsLeft+1, preEnd);
        return root;
    }

}