class Solution {
	//利用hashmap遍历
    public int majorityElement(int[] nums) {
        // 临时map 存放 key-count
        Map<Integer, Integer> tmp = new HashMap<Integer, Integer>();
        int max_count = nums.length / 2;
        int max_index = 0;
        for (int i : nums) {
            if (tmp.containsKey(i)) {
                tmp.put(i, tmp.get(i) + 1);
            } else {
                tmp.put(i, 1);
            }

            if (tmp.get(i) > max_count) {
                return i;
            }
        }
        return max_index;
    }
	
	//如果将数组 nums 中的所有元素按照单调递增或单调递减的顺序排序，那么下标为 [nums.length/2]
	public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
	
	//摩尔投票
    public int majorityElement(int[] nums) {
        int cand_num = nums[0], count = 1;
        for (int i = 1; i < nums.length; ++i) {
            if (cand_num == nums[i])
                ++count;
            else if (--count == 0) {
                cand_num = nums[i];
                count = 1;
            }
        }
        return cand_num;
    }
}
