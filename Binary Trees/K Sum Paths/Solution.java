//Link To Question : https://practice.geeksforgeeks.org/problems/k-sum-paths/1

class Solution
{
    static int count;
    public int sumK(Node root,int k)
    {
        count=0;
        ArrayList<Integer> a=new ArrayList<>();
        solve(root,a,k);
        return count;
    }
    public static void solve(Node root,ArrayList<Integer> a,int k){
        if(root==null){
            return;
        }
        a.add(root.data);
        int sum=0;
        for(int i=a.size()-1;i>=0;i--){
            sum+=a.get(i);
            if(sum==k){
                count=(count+1);
            }
        }
        solve(root.left,a,k);
        solve(root.right,a,k);
        a.remove(a.size()-1);
    }
}