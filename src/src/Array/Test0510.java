package Array;

public class TestTwo {
    public int minPathSum(int[][] grid) {
    int m = grid.length;
    int n = grid[0].length;
    int[][] dp = new int[m][n];
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(i==0 && j==0){ //原点初始化
                dp[i][j]=grid[0][0];
                continue;
            }
            if(i==0){//第一行初始化
                dp[i][j] = dp[i][j-1]+grid[i][j];
            } else if(j==0){//第一列初始化
                dp[i][j] = dp[i-1][j]+grid[i][j];
            }else{
                dp[i][j]=Math.min(dp[i-1][j]+grid[i][j],dp[i][j-1]+grid[i][j]);//上一步是从下走还是从右走，选最小
            }
        }
    }
        
        return dp[m-1][n-1];
    }

}
