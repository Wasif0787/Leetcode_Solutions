class Solution {
    public boolean isMonotonic(int[] A) {
        boolean increase = false;
        boolean decrease = false;
        
        for (int i = 0; i < A.length-1; i++) {
            if (A[i+1] < A[i]) {
                decrease = true;
            }
            if (A[i+1] > A[i]) {
                increase = true;
            }
        }
        
        return increase && decrease ? false : true;
    }
}
