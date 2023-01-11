//Link To Question: https://practice.geeksforgeeks.org/problems/top-view-of-binary-tree/1

class Solution
{
    static ArrayList < Integer > topView(Node root) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        TreeMap<Integer, ArrayList<Integer>> treeMap = new TreeMap<>();

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        Queue<Integer> indeces = new LinkedList<>();
        indeces.add(0);

        while(!queue.isEmpty() && !indeces.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){
                Node current = queue.poll();
                Integer index = indeces.poll();

                treeMap.putIfAbsent(index, new ArrayList<>());

                if(current!=null){
                    treeMap.get(index).add(current.data);
                }

                if(current!=null && index!=null && current.left!=null){
                    queue.add(current.left);
                    indeces.add(index-1);
                }

                if(current!=null && index!=null && current.right!=null){
                    queue.add(current.right);
                    indeces.add(index+1);
                }
            }
        }
        for(Map.Entry<Integer, ArrayList<Integer>> integerVector: treeMap.entrySet()){
            for(int i=0; i< integerVector.getValue().size();i++){
                integerArrayList.add(integerVector.getValue().get(i));
                break;
            }
        }
        return integerArrayList;
    }
}
