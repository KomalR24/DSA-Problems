// Link To Question: https://practice.geeksforgeeks.org/problems/preorder-traversal-and-bst4006/1

class Solution {
    static int canRepresentBST(int arr[], int N) {
        Stack<Integer> st=new Stack<>();
        int root=Integer.MIN_VALUE;
        for(int i=0;i<N;i++){
            if(arr[i]<root)return 0;

            while(!st.isEmpty() && arr[i]>st.peek()){
                root=st.pop();
            }
            st.push(arr[i]);
        }
        return 1;
    }
}
