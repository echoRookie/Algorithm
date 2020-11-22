public class ImageSmoother {
    public static void main(String[] args) {
        int[][] res = imageSmoother(new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}});
        for (int i = 0; i < res.length; i++) {
            String str = "";
            for (int j = 0; j < res[0].length; j++) {
                str = str + res[i][j] + " ";
            }
            System.out.println(str);
        }
    }

    public static int[][] imageSmoother(int[][] M) {
        int rows = M.length;
        int columns = M[0].length;
        int[][] res = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                res[i][j] = average(i, j, M);
            }
        }
        return res;
    }

    // 计算平均和
    public static int average(int rowIndex, int colIndex, int[][] M) {
        int rows = M.length;
        int columns = M[0].length;
        int count = 0;
        int sum = 0;
        for (int i = rowIndex - 1; i <= rowIndex + 1; i++) {
            for (int j = colIndex - 1; j <= colIndex + 1; j++) {
                if (i >= 0 && i <= rows - 1 && j >= 0 && j <= columns - 1) {
                    sum += M[i][j];
                    count++;
                }
            }
        }
        return sum / count;
    }
}
