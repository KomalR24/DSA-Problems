//Link To Question: https://practice.geeksforgeeks.org/problems/minimum-swap-required-to-convert-binary-tree-to-binary-search-tree/0?page=1&sortBy=newest&query=page1sortBynewest

class Solution {
    public static int minSwaps(int n, int[] arr) {
        List<Integer> list = new ArrayList<>();
        inorder(arr,list,n,0);
        return minSwap(n,list);
    }

    static void inorder(int[] arr, List<Integer> list, int n, int index){
        if(index>=n) return;
        inorder(arr,list,n,2*index+1);
        list.add(arr[index]);
        inorder(arr,list,n,2*index+2);
    }

    public static int minSwap(int n, List<Integer> list){
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> al = new ArrayList<>(list);
        Collections.sort(al);
        for(int i=0;i<list.size();i++){
            map.put(list.get(i),i);
        }

        int count =0;
        for(int i=0;i<list.size();i++){
            int x = list.get(i);
            if(list.get(i)!=al.get(i)){
                count++;
                Collections.swap(list,i,map.get(al.get(i)));
                map.put(x,map.get(al.get(i)));
                map.put(al.get(i),i);
            }
        }
        return count;
    }
}