//Link To Question: https://practice.geeksforgeeks.org/problems/leaf-at-same-level/1

class Solution
{
    int levelOfLeaf = 0;
    boolean ifLeaf(Node root, int level){
        if(root==null) return true;
        if(root.right==null && root.left==null){
            if(levelOfLeaf==0){
                levelOfLeaf = level;
                return true;
            }
            return levelOfLeaf==level;
        }
        return ifLeaf(root.right,level+1) && ifLeaf(root.left,level+1);
    }

    boolean check(Node root)
    {
        return ifLeaf(root,1);
    }
}
