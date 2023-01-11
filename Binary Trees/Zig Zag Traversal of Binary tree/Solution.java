//Link To Question: https://practice.geeksforgeeks.org/problems/zigzag-tree-traversal/1

class Solution
{
     ArrayList<Integer> zigZagTraversal(Node root)
    {
        ArrayList<Integer> al = new ArrayList<>();
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        int f=0;
        while(!q.isEmpty()){
            f++;
            ArrayList<Integer> temp = new ArrayList<>();
            int size = q.size();
            while(size>0){
                Node curr = q.poll();
                temp.add(curr.data);
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
                size--;
            }
            if(f%2==0){
                Collections.reverse(temp);
            }
            for(int i=0;i<temp.size();i++){
                al.add(temp.get(i));
            }
        }
        return al;
    }
}