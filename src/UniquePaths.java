import java.util.ArrayList;
import java.util.List;

/*一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。

        机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。

        问总共有多少条不同的路径？



        例如，上图是一个7 x 3 的网格。有多少可能的路径？

         

        示例 1:

        输入: m = 3, n = 2
        输出: 3
        解释:
        从左上角开始，总共有 3 条路径可以到达右下角。
        1. 向右 -> 向右 -> 向下
        2. 向右 -> 向下 -> 向右
        3. 向下 -> 向右 -> 向右
        示例 2:

        输入: m = 7, n = 3
        输出: 28*/
public class UniquePaths {
    public static void main(String[] args) {
        UniquePaths uniquePaths = new UniquePaths();
        System.out.println(uniquePaths.uniquePaths2(7,3));
    }
    //回溯超时，但是解法没问题，大数时候内存溢出
    public int uniquePaths(int m, int n) {

        List<Integer> result = new ArrayList<>();
        backtrack(m, n, result, 0, 0);
        return  result.size();
    }
    public void backtrack(int m, int n,  List<Integer> result,  int row, int col){
        if(row == n -1 && col == m-1){
            result.add(1);
            return;
        }
        if(col > m-1 || row > n-1)
            return;
        if(col < m-1 && row < n-1){
            backtrack(m, n, result, row +1, col );
            backtrack(m,n,result,row, col+1);
        }
        if(col== m-1 && row < n-1){
            backtrack(m, n, result, row +1, col );

        }
        if(col < m-1 && row == n-1){
            backtrack(m,n,result,row, col+1);
        }
    }
    // 递归求解
    public int uniquePaths2(int m, int n) {
        int dp[][] = new int[n][m];
        for(int i =0; i < m; i++)
            dp[0][i] = 1;
        for(int j = 0; j < n ; j++)
            dp[j][0] =1;
        for(int i =1; i < n; i ++)
        {
            for(int j = 1; j < m; j++)
                dp[i][j] = dp[i-1][j] + dp[i][j -1];
        }
        return dp[n-1][m-1];

    }
}
