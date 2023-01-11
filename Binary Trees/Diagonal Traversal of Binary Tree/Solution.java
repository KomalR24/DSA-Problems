//Link To Question: https://practice.geeksforgeeks.org/problems/diagonal-traversal-of-binary-tree/1

class Solution
{
    public ArrayList<Integer> diagonal(Node root)
    {
        ArrayList<Integer> al = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(q.size()>0){
            Node tem = q.remove();
            while(tem!=null){
                al.add(tem.data);
                if(tem.left!=null){
                    q.add(tem.left);
                }
                tem = tem.right;
            }
        }
        return al;
    }
}