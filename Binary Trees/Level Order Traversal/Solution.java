class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node node)
    {
        ArrayList<Integer> al = new ArrayList<>();
        Queue<Node> q = new LinkedList<Node>();
        if(node==null) return al;
        q.add(node);
        while(!q.isEmpty()){
            Node curr = q.remove();
            al.add(curr.data);
            if(curr.left!=null) q.add(curr.left);
            if(curr.right!=null) q.add(curr.right);
        }
        return al;
    }
}




