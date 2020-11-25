public class MatrixReshape {
    public static void main(String[] args) {
        matrixReshape(new int[][]{{1, 2}, {3, 4}}, 1, 4);
    }

    public static int[][] matrixReshape(int[][] nums, int r, int c) {
        // 计算数组的行和列
        if (nums == null || nums.length == 0) {
            return nums;
        }
        int rows = nums.length;
        int columns = nums[0].length;
        if (rows * columns != r * c) {
            return nums;
        }
        // 临时结果存放数组
        int[] temp = new int[r * c];
        int index = 0;
        // 按层次遍历存放二位矩阵的值
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                temp[index] = nums[i][j];
                index++;
            }
        }
        // 填充结果集
        int[][] res = new int[r][c];
        index = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = temp[index];
                index++;
            }
        }
        return res;
    }
}
