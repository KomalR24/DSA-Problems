//Link To Question: https://practice.geeksforgeeks.org/problems/two-mirror-trees/1

class Solution {
    boolean areMirror(Node a, Node b) {
        if(a == null && b == null)
            return true;

        if(a != null && b != null && a.data == b.data && areMirror(a.left, b.right) && (areMirror(a.right, b.left)))
            return true;

        return false;
    }
}