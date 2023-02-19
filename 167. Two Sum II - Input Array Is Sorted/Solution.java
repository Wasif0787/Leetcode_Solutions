class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ans[]=new int[2];
        int lp=0;
        int rp=numbers.length-1;
        while(lp!=rp){
            if(numbers[lp]+numbers[rp]==target){
                ans[0]=lp+1;
                ans[1]=rp+1;
                return ans;
            }
            if(numbers[lp]+numbers[rp]<=target){
                lp++;
            } else {
                rp--;
            }
        }
        return ans;
    }
}
