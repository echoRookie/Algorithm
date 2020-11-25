public class Rotate1 {
    public static void main(String[] args) {
        int[][] res = new int[][]{{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        rotate(res);
        for (int i = 0; i < res.length; i++) {
            String str = "";
            for (int j = 0; j < res[0].length; j++) {
                str = str + res[i][j] + " ";
            }
            System.out.println(str);
        }
    }

    public static void rotate(int[][] matrix) {
        int rows = matrix.length;
        if (rows <= 1) {
            return;
        }
        //计算需要翻转的层数,按层去翻转
        int floor = (rows + 1) / 2;
        // 设置需要翻转的方向边界
        int up = 0;
        int down = rows - 1;
        int left = 0;
        int right = rows - 1;
        //按每层去翻转
        for (int i = floor; i > 0; i--) {
            if (right - left == 0) {
                break;
            }
            // 辅助数组
            int[] temp = new int[right - left + 1];
            // 横向右
            for (int j = 0; j <= right - left; j++) {
                temp[j] = matrix[j + up][right];
                if (j != right - left) {
                    matrix[j + up][right] = matrix[up][j + left];
                } else {
                    matrix[j + up][right] = temp[0];
                }
            }
            // 竖向下
            int[] temp1 = new int[right - left + 1];
            for (int j = 0; j <= down - up; j++) {

                if (j == 0) {
                    temp1[j] = temp[temp.length - 1];
                } else {
                    temp1[j] = matrix[down][right - j];
                }
                matrix[down][right - j] = temp[j];


            }
            // 横向左
            int[] temp2 = new int[right - left + 1];
            for (int j = 0; j <= right - left; j++) {

                if (j == 0) {
                    temp2[j] = temp1[temp.length - 1];
                } else {
                    temp2[j] = matrix[down - j][left];
                }
                matrix[down - j][left] = temp1[j];


            }
            // 竖向上
            for (int j = 0; j <= down - up; j++) {
                matrix[up][j + left] = temp2[j];
            }
            up++;
            down--;
            left++;
            right--;
        }
    }
}
