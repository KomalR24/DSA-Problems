// Link to Question: https://practice.geeksforgeeks.org/problems/find-duplicates-in-an-array/1

class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        int[] count = new int[n];
        for(int i:arr)
            count[i]++;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<count.length;i++) {
            if(count[i]>1)
                list.add(i);
        }
        if(list.isEmpty())
            list.add(-1);
        return list;
    }
}
