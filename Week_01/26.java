class Solution {
	
	//算法训练营第一周作业：26. 删除排序数组中的重复项
    //我自己想到的，用双指针，用于找不相等的数值，然后移动元素，然后就没有思路了。
    // 直接看题解，思路清晰，代码如下。
    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; ++j) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;//因为i是下标
    }

｝