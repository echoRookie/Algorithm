public class MaxCount {
    // 暴力求解超时
    public int maxCount(int m, int n, int[][] ops) {
        // 初始化数组
        int[][] res = new int[m][n];
        int max = 0;
        if(ops.length <= 0){
            return m * n;
        }
        for (int i = 0; i < ops.length; i++) {
            int row = ops[i][0];
            int column = ops[i][1];
            for (int j = 0; j < row; j++) {
                for (int k = 0; k < column; k++) {
                    res[j][k]++;
                    if (res[j][k] > max) {
                        max = res[j][k];
                    }
                }
            }
        }
        // 查找最大值
        int count = 0;
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                if (res[i][j] == max) {
                    count++;
                }
            }
        }
        return count;
    }
    public int maxCount1(int m, int n, int[][] ops) {
        if(ops.length <= 0){
            return m * n;
        }
        int row = Integer.MAX_VALUE;
        int column = Integer.MAX_VALUE;
        for (int i = 0; i < ops.length; i++) {
             row = Math.min(row, ops[i][0]);
             column = Math.min(column, ops[i][1]);
        }
        return row * column;
    }
}
