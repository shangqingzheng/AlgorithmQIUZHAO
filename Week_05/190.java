public class Solution {
    // you need treat n as an unsigned value
	//正常思路位运算。
    public int reverseBits(int n) {
        int res = 0;
		for (int i = 0; i < 32; i++) {
			//1.左移空一位接受n的最低位。
			res <<= 1;
			//n&1 获取n的最低位，加到res上面空出来的位置
			res += n&1;
			//n 右移一位 为下一步准备。
			n >>=1;
		}
		return res;
    }
}