class Solution {
	//1.一直除以2，直到不是2的倍数
    public boolean isPowerOfTwo(int n) {
		if (n == 0) return false;
		while (n % 2 == 0) {
			n /= 2;
		}
		return n == 1;
    }
	//2.位移运算 
	//n 二进制最高位为 1，其余所有位为 0；
	//n−1 二进制最高位为 0，其余所有位为 1；
	//所以 n & (n - 1) == 0
	//例如：2^3 1000；2^3-1 0111   (1000) & (0111) == 0
	public boolean isPowerOfTwo(int n) {
		return n > 0 && (n & (n - 1)) == 0;
	}
}