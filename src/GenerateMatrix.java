public class GenerateMatrix {
    public static void main(String[] args) {
        int[][] res = generateMatrix(3);
        for (int i = 0; i < res.length; i++) {
            String str = "";
            for (int j = 0; j < res[0].length; j++) {
                str = str + res[i][j] + " ";
            }
            System.out.println(str);
        }
    }

    public static int[][] generateMatrix(int n) {
        // 初始化数组
        int[][] res = new int[n][n];
        // 定义四个方向的指针
        int up = 0;
        int down = res.length - 1;
        int left = 0;
        int right = res[0].length - 1;
        // 设置初始值
        int count = 1;
        while (count <= n * n) {
            // 向右填充
            for (int i = left; i <= right; i++) {
                res[up][i] = count;
                count++;
                if (count == n * n + 1) {
                    break;
                }
            }
            up++;
            if (up > down || count == n * n + 1) {
                break;
            }
            // 向下填充
            for (int i = up; i <= down; i++) {
                res[i][right] = count;
                count++;
                if (count == n * n + 1) {
                    break;
                }
            }
            right--;
            if (right < left || count == n * n + 1) {
                break;
            }
            //向左填充
            for (int i = right; i >= left; i--) {
                res[down][i] = count;
                count++;
                if (count == n * n + 1) {
                    break;
                }
            }
            down--;
            if (down < up || count == n * n + 1) {
                break;
            }
            // 向上填充
            for (int i = down; i >= up; i--) {
                res[i][left] = count;

                count++;
                if (count == n * n + 1) {
                    break;
                }
            }
            left++;
            if (left > right || count == n * n + 1) {
                break;
            }

        }
        return res;
    }
}
