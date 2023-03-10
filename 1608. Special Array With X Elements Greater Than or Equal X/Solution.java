class Solution {
	public int specialArray(int[] nums) {
		int left = 0;
		int right = nums.length;
		int ans = -1;
		 while(left <= right) {
			int mid = left + (right - left)/2;
			int count = 0;
			for(int i: nums) {
				if(i >= mid) {
					count++;
				}
			}
			if(count == mid) {
				ans = mid;
				break;
			}else if(count > mid) {
				left = mid + 1;
			}else {
				right = mid - 1;
			}
		}
		return ans;
	}
}
