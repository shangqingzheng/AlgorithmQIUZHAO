class Solution {
	public int rob(int[] nums) {
		if (nums == null || nums.length == 0) return 0;
		
		int n = nums.length;
		int[][] a = new int[n][2];
		
		a[0][0] = 0;
		a[0][1] = nums[0];
		
		for (int i = 1; i < n; ++i) {
			a[i][0] = Math.max(a[i-1][0], a[i-1][1]);
			a[i][1] = a[i-1][0] + nums[i];
		}
		
		return Math.max(a[n-1][0], a[n-1][1]);
	}
}

class Solution {
	public int rob(int[] nums) {
		int prevMax = 0;
		int currMax = 0;
		
		for (int x : num) {
			int temp = currMax;
			currMax = Math.max(prevMax + x, currMax);
			prevMax = temp;
		}
		return currMax;
	}
}