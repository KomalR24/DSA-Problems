// Link to Question: https://practice.geeksforgeeks.org/problems/move-all-negative-elements-to-end1813/1

class Solution {
    public void segregateElements(int arr[], int n)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=n-1; i>=0; i--){
            if(arr[i]<0){
                list.add(arr[i]);
            }
        }
        int j = 0;
        for(int i=0; i<n; i++){
            if(arr[i]>=0){
                arr[j++] = arr[i];
            }
        }
        int k =0;
        for(int i=list.size()-1; i>=0; i--){
            arr[n-1-(k++)] = list.get(list.size()-1-i);
        }
    }
}
