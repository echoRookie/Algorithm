public class MinCostClimbingStairs {
    public static void main(String[] args) {
        System.out.println(minCostClimbingStairs(new int[]{10,15,20}));
    }
    public static int minCostClimbingStairs(int[] cost) {
           int dp[] = new int[cost.length +1];
           dp[0] = 0;
           dp[1] = 0;
           dp[2] = Math.min(cost[0], cost[1]);
           for (int i= 3; i<= cost.length; i++){
             int rst =  Math.min(cost[i-2]+ dp[i-2], (cost[i-1] + dp[i-1]));
             if(rst == cost[i-2]+ dp[i-2])
                 dp[i] = cost[i-2]+ dp[i-2];
             else
                 dp[i] += cost[i-1] + dp[i-1];
           }

           return  dp[cost.length];
    }
}
