// Link To Question: https://practice.geeksforgeeks.org/problems/predecessor-and-successor/1

class Solution
{
    public static Node predecessor(Node root,int key){
        Node pre = null;
        while(root!=null){
            if(root.data>=key){
                root = root.left;
            }
            else{
                pre = root;
                root = root.right;
            }
        }
        return pre;
    }
    public static Node successor(Node root,int key){
        Node succ = null;
        while(root!=null){
            if(root.data>key){
                succ = root;
                root = root.left;
            }
            else{
                root = root.right;
            }
        }
        return succ;
    }
    public static void findPreSuc(Node root, Res p, Res s, int key)
    {
        p.pre = predecessor(root,key);
        s.succ = successor(root,key);
    }
}