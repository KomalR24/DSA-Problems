//Link To Question: https://practice.geeksforgeeks.org/problems/reverse-level-order-traversal/1

class Solution
{
    public ArrayList<Integer> reverseLevelOrder(Node root)
    {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        Queue<Node> q = new LinkedList<Node>();
        if(root==null) return al;
        q.add(root);
        while(!q.isEmpty()){
            ArrayList<Integer> a = new ArrayList<>();
            int count = q.size();
            for(int i=0;i<count;i++){
                Node curr = q.poll();
                a.add(curr.data);
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            Collections.reverse(a);
            for(int i=0;i<a.size();i++){
                al.add(a.get(i));
            }
        }
        Collections.reverse(al);
        return al;
    }
}



