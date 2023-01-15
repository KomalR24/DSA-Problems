// Link To Question: https://practice.geeksforgeeks.org/problems/brothers-from-different-root/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article

class Solution
{
    static int count =0;
    public static void mapping(Node root,HashMap<Integer,Integer> map){
        if(root==null)return;
        mapping(root.left,map);
        map.put(root.data,1);
        mapping(root.right,map);
    }
    public static void solve(Node root,HashMap<Integer,Integer> map,int x){
        if(root==null)return;
        if(map.containsKey(x-root.data)){
            count++;
        }
        solve(root.left,map,x);
        solve(root.right,map,x);
    }
    public static int countPairs(Node root1, Node root2, int x)
    {
        count =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        mapping(root2,map);
        solve(root1,map,x);
        return count;
    }
}