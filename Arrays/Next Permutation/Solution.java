// Link to Question: https://practice.geeksforgeeks.org/problems/next-permutation5226/1

class Solution {
    static List<Integer> nextPermutation(int N, int arr[]) {
        int[] arr2 = new int[N];
        arr2 = arr;
        int ind1 = findBreakingPt(N, arr2);
        if (ind1 == -1) {
            reverse(0, N - 1, arr2);
        } else {
            int ind2 = findNextHighest(ind1, N, arr2);
            swap(ind1, ind2, arr2);
            reverse(ind1 + 1, N - 1, arr2);
        }
        List<Integer> ans = new ArrayList<Integer>();
        for (int i : arr2) {
            ans.add(i);
        }
        return ans;
    }
    public static int findBreakingPt(int N, int arr[]){
        int breakingPt = -1;
        for(int i = N-2; i >= 0; i--){
            if(arr[i]<arr[i+1]){
                breakingPt = i;
                return i;
            }
        }
        return breakingPt;
    }
    public static int findNextHighest(int ind1,int N,int[] arr){
        int nextHighest = 0;
        int breakingPtValue  = arr[ind1];
        for(int i = N-1; i >= 0; i--){
            if(arr[i]> breakingPtValue){
                return i;
            }
        }
        return nextHighest;
    }
    public static void reverse(int ind1, int ind2, int arr[]){
        int i = ind1;
        int j = ind2;
        while(i<j){
            swap(i++, j--, arr);
        }
    }
}
