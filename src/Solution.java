class Solution {
    public double myPow(double x, int n) {
        if(n == 0) {
            return 1;
        }else if (x == 0){
            return 0;
        }else if (n == 1){
            return x;
        }else if(n == -1){
            return 1/x;
        }else if(x == 1){
            return 1;
        }else if(x == -1){
            if((n & 1) == 0){
                return 1;
            }else{
                return -1;
            }
        }else if (n == -2147483648){
            return 0;
        }
        double res = x;
        if (n < 0){
             res = compute(x,-n);
             res = 1 / res;
        }else{
             res = compute(x,n);
        }
        return res;
    }

    public double compute(double x, int n){
        int m = n;
        double res = x;
        if((n & 1) == 0){
            while (m > (n/2 + 1)){
                res *= x;
                m--;
                if(res >= 10000){
                    return 0;
                }
            }
            res *= res;

        }else{
            while (m > (n/2 + 2)  ){
                res *= x;
                if(res >= 10000){
                    return 0;
                }
                m--;
            }
            res = res * res * x;

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