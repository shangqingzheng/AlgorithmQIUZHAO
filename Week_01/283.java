class Solution {
	
	//利用双指针，快慢指针，快指针找到不为零的跟慢指针替换位置，通知慢指针要加一（这个第一次思路没有跟上来）。
	public void moveZeroes(int[] nums) {
		if(nums==null) {
			return;
		}
		//两个指针i和j
		int j = 0;
		for(int i=0;i<nums.length;i++) {
			//当前元素!=0，就把其交换到左边，等于0的交换到右边
			if(nums[i]!=0) {
				int tmp = nums[i];
				nums[i] = nums[j];
				nums[j++] = tmp;
			}
		}
	}

｝