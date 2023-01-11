//Link To Question: https://practice.geeksforgeeks.org/problems/right-view-of-binary-tree/1

class Solution
{
    ArrayList<Integer> leftView(Node root)
    {
        ArrayList<Integer> al = new ArrayList<>();
        Queue<Node> q = new LinkedList<Node>();
        if(root == null) return al;
        q.add(root);
        while(q.isEmpty()==false){
            int count = q.size();
            for(int i=0;i<count;i++){
                Node curr = q.poll();
                if(i==count-1){
                    al.add(curr.data);
                }
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
        return al;
    }
}
