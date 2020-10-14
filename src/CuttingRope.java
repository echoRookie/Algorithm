public class CuttingRope {
    public static void main(String[] args) {
       /* System.out.println(cuttingRope());*/
    }
    public static int cuttingRope(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i= 2; i <= n; i++){
            for(int j = 1; j < i; j++){
                int max = Math.max(j * (i-j), j * dp[i-j]);
                dp[i] = Math.max(dp[i], max);
            }
        }
        return dp[n];
    }
}
