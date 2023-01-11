//Link To Question: https://practice.geeksforgeeks.org/problems/bottom-view-of-binary-tree/1

class Solution
{
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        ArrayList<Integer> al = new ArrayList<>();
        TreeMap<Integer, ArrayList<Integer>> treemap = new TreeMap();
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        Queue<Integer> in = new LinkedList<Integer>();
        in.add(0);
        while(!q.isEmpty() && !in.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                Node curr = q.poll();
                Integer idx = in.poll();
                treemap.putIfAbsent(idx, new ArrayList<>());
                if(curr!=null){
                    treemap.get(idx).add(curr.data);
                }
                if(curr!=null && idx!=null && curr.left!=null){
                    q.add(curr.left);
                    in.add(idx-1);
                }
                if(curr!=null && idx!=null && curr.right!=null){
                    q.add(curr.right);
                    in.add(idx+1);
                }
            }
        }
        for(Map.Entry<Integer, ArrayList<Integer>> iv : treemap.entrySet()){
            for(int i=0;i<iv.getValue().size();i++){
                if(i==iv.getValue().size()-1){
                    al.add(iv.getValue().get(i));
                }
            }
        }
        return al;
    }
}