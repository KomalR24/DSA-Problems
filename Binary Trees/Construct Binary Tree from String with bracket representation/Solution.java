//Link To Question: https://practice.geeksforgeeks.org/problems/construct-binary-tree-from-string-with-bracket-representation/1

class Solution {

    public static Node treeFromString(String s) {
        return solve(s, 0, s.length()-1);
    }

    public static Node solve(String str, int s, int e){
        if(s>e) return null;
        String num ="";
        while(s<str.length() && (str.charAt(s)>='0' && str.charAt(s)<='9')){
            num += str.charAt(s);
            s++;
        }

        Node root = new Node(Integer.parseInt(num));
        int index=-1;
        if(s<=e && str.charAt(s)=='('){
            index = balancePar(str, s,e);
        }
        if(index!=-1){
            root.left = solve(str,s+1,index-1);
            root.right = solve(str,index+2,e-1);
        }
        return root;
    }

    static int balancePar(String str, int s, int e){
        if(s>e) return -1;
        Stack<Character> st = new Stack<>();
        for(int i=s;i<=e;i++){
            if(str.charAt(i)=='('){
                st.push(str.charAt(i));
            }
            if(str.charAt(i)==')'){
                if(st.peek()=='('){
                    st.pop();
                }
                if(st.isEmpty()) return i;
            }
        }
        return -1;
    }
}