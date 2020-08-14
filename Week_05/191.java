public class Solution {
    // you need to treat n as an unsigned value
	//参照官方，第一种掩码，遍历。
    public int hammingWeight(int n) {
        int bits = 0;
		int mask = 1;
		for (int i = 0; i < 32; i++) {
			if ((n & mask) != 0) {
				bits++;
			}
			mask <<= 1;
		}
		return bits;
    }
	
	//参照官方和课件，清零最低位的1。
    public int hammingWeight(int n) {
        int sum = 0;
		while(n != 0) {
			sum ++;
			n &= (n - 1);
		}
		return sum;
    }
}