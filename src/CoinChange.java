public class CoinChange {
    public static void main(String[] args) {
        int[] a= coinChange(new int[]{1,2,5}, 11);
        int i = 0;
        for (int model:a
             ) {
            System.out.println(model + "行数：" + i);
            i++;
        }
    }
    public static int[] coinChange(int[] coins, int amount) {
      int dp[] = new int[amount + 1];
      int min = coins[0];
      for (int j= 1; j< coins.length; j++){
          if(coins[j] < min)
              min = coins[j];

      }
      dp[0] = 0;
      for (int i = 1; i <= amount; i++){
         int minDP = Integer.MAX_VALUE;
         for (int k = 0; k < coins.length; k++){
               if(i- coins[k]< 0) continue;
               if(dp[i- coins[k]] < minDP)
                    minDP = dp[i- coins[k]] + 1;
         }
         //if(minDP != Integer.MAX_VALUE )
         dp[i] = minDP ;
      }
      return dp;
    }
}
