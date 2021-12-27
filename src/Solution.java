class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        } else if (x == 0) {
            return 0;
        }
        double res = 1.0;
        long m = n;

        if (m < 0) {
            m = -m;
            x = 1 / x;
        }
        while (m > 0) {
            if ((m & 1) == 1) {
                res *= x;
            }
            x *= x;
            m = m >> 1;
        }
        return res;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        double x = -1;
        int n = 3;
        double v = s.myPow(x, n);
        System.out.println("v = " + v);
    }
}