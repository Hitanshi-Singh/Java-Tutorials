class Fibonacci {
    public static int fib(int n, int f[]) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (f[n] != 0) {
            return f[n];
        }
        f[n] = fib(n - 1, f) + fib(n - 2, f);
        return f[n];
    }
    //Tabulation wala way -->
    public static int tabulationFibo(int n){
        //creation of table(array) coz its tabulation method(obvio)
        int dp[]=new int[n+1];
        //initialization
        dp[0]=0;//not req tho
        dp[1]=1;
        //filling from chhota to bada
        for(int i =2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 6;
        int f[] = new int[n + 1];
        System.out.println(fib(n, f));
        System.out.println(tabulationFibo(n));
    }
}