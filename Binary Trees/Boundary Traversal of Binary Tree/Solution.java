//Link To Question: https://practice.geeksforgeeks.org/problems/boundary-traversal-of-binary-tree/1

class Solution
{
    ArrayList <Integer> boundary(Node node)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        if(node==null)return ans;
        if(node.left==null && node.right==null){
            ans.add(node.data);
            return ans;
        }
        Node root=node;
        ans.add(root.data);
        root=root.left;
        while(root!=null){
            if(root.left==null && root.right==null)break;
            ans.add(root.data);
            if(root.left!=null){
                root=root.left;
            }
            else{
                root=root.right;
            }
        }
        root=node;
        Inorder(root,ans);
        ArrayList<Integer> list=new ArrayList<>();
        Node curr=node.right;
        while(curr!=null){
            if(curr.left==null && curr.right==null)break;
            list.add(curr.data);
            if(curr.right!=null)
            {curr=curr.right;}
            else{
                curr=curr.left;
            }
        }
        int n=list.size();
        for(int i=n-1;i>=0;i--){
            ans.add(list.get(i));
        }
        return ans;
    }
    void Inorder(Node root,ArrayList<Integer> ans){
        if(root==null)return;
        Inorder(root.left,ans);
        if(root.left==null && root.right==null){
            ans.add(root.data);
        }
        Inorder(root.right,ans);
    }
}