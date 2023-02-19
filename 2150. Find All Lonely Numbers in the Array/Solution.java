class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> l1=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        if(n==1){
            l1.add(nums[0]);
        }
        else{
        if(nums[0]!=nums[1] && nums[0]+1!=nums[1]){
            l1.add(nums[0]);
        }
        if(nums[n-1]!=nums[n-2] && nums[n-1]-1!=nums[n-2]){
            l1.add(nums[n-1]);
        }
        }
        for(int i=1;i<n-1;i++){
            if(nums[i]!=nums[i-1] && nums[i]!=nums[i+1] && nums[i]-1!=nums[i-1] && nums[i]+1!=nums[i+1]){
                l1.add(nums[i]);
            }
        }
        return l1;
    }
}
