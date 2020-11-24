/*
 * 代码可以再精简一些，有时间优化*/
public class FindDiagonalOrder {
    public static void main(String[] args) {
        int[] res = findDiagonalOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        String str = "";
        for (int i = 0; i < res.length; i++) {
            str = str + res[i] + " ";
        }
        System.out.println(str);
    }

    public static int[] findDiagonalOrder(int[][] matrix) {
        // 计算的数组的行列值
        int rows = matrix.length;
        if (rows == 0) {
            return new int[]{};
        }
        int columns = matrix[0].length;
        // 控制方向 false 向下, true 向下
        boolean direction = false;
        int[] res = new int[rows * columns];
        int index = 0;
        int rowIndex = -1;
        int columnIndex = 0;
        while (index < rows * columns) {
            if (!direction) {
                // 遇到边界向下
                if (rowIndex + 1 > rows - 1) {
                    columnIndex++;
                } else {
                    rowIndex++;
                }
                // 查找满足范围的对角线上的值
                while (rowIndex >= 0 && rowIndex <= rows - 1 && columnIndex >= 0 && columnIndex <= columns - 1) {
                    res[index] = matrix[rowIndex][columnIndex];
                    index++;
                    rowIndex--;
                    columnIndex++;
                }
                rowIndex++;
                columnIndex--;
                direction = !direction;
            } else {
                if (columnIndex + 1 > columns - 1) {
                    rowIndex++;
                } else {
                    columnIndex++;
                }
                while (rowIndex >= 0 && rowIndex <= rows - 1 && columnIndex >= 0 && columnIndex <= columns - 1) {
                    res[index] = matrix[rowIndex][columnIndex];
                    index++;
                    rowIndex++;
                    columnIndex--;
                }
                rowIndex--;
                columnIndex++;
                direction = !direction;
            }
        }
        return res;
    }
}
