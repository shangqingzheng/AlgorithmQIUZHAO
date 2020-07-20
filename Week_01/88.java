class Solution {
	
	//88.  合并两个有序数组
    //合并有序的两个数组。充分利用数组1的后面剩余的空间。双指针从前往后遍历比较。
    public void merge(int[] nums1, int m, int[] nums2, int n) {
		//分别指向两个数组有效数字最后的下标。
        int p1 = m - 1;
		int p2 = n - 1;
		
		//指向第一个数组的最后一个下标，这里用于存放当前遍历到的最大数。
		int p = n + m - 1;
        // return null;
		while (p1 >= 0 && p2 >=0) {
			//不求写的简短，但求写的容易理解。
			if (nums1[p1] > nums2[p2]) {
				nums1[p] = nums1[p1];
				p1--;
			} else {
				nums1[p] = nums2[p2];
				p2--;
			}
			p--;
		}
		//这个判断条件不如不加，会有特殊情况存在，比如：[0],[1]
		//if (p2 != 0) {
			System.arraycopy(nums2, 0, nums1, 0, p2+1);
		//}
    }

｝