class Solution {
    public int findContentChildren(int[] g, int[] s) {
        //双指针
        int gi = 0; //小朋友胃口值
        int sj = 0; //饼干
        int result = 0; //满足的个数
        //先排序
        Arrays.sort(g);
        Arrays.sort(s);
        while (gi < g.length && sj < s.length) {
            if (g[gi] <= s[sj]) {
                result++;
                gi++;
                sj++;
            } else {
                sj++;
            }
        }
        return result;
    }
}