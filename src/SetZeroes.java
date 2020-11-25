public class SetZeroes {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        ;
        int columns = matrix[0].length;
        //设置第一行和第一列为标记位
        boolean rowFlag = false;
        boolean columnFlag = false;
        //判断第一行第一列是否有0
        for (int i = 0; i < columns; i++) {
            if (matrix[0][i] == 0) {
                rowFlag = true;
                break;
            }
        }
        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0) {
                columnFlag = true;
                break;
            }
        }
        // 遍历数组如果为0，则将标记位设置为0
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < columns; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        // 遍历数组，标记为0，则置0
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < columns; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        if (rowFlag) {
            for (int i = 0; i < columns; i++) {
                matrix[0][i] = 0;
            }
        }
        if (columnFlag) {
            for (int i = 0; i < rows; i++) {
                matrix[i][0] = 0;
            }
        }
        
    }
}
