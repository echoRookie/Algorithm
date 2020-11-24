import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {
    public static void main(String[] args) {
        List<Integer> res = spiralOrder(new int[][]{{1,2, 3}, {4, 5, 6}, {7, 8, 9}});
        String str = "";
        for (Integer num: res) {
            str = str + num + " ";
        }
        System.out.println(str);
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int row = matrix.length;
        int column = matrix[0].length;
        // 设置四个范围
        int[] left = new int[]{0 , 0};
        int[] right = new int[]{0,column -1};
        int[] left1 = new int[]{row -1 , 0};
        int[] right1 = new int[]{row - 1, column-1};
        int rowIndex = 0, columnIndex = 0;
        while (left[1] <= right[1] && right[0] <= right1[0] && right1[1] >= left1[1] && left1[0] >= left[0]){
            //横向右
            if(columnIndex <= right[1] && rowIndex == right[0] ){
                while (columnIndex <= right[1]){
                    res.add(matrix[rowIndex][columnIndex]);
                    columnIndex ++;
                }
                right[0] ++;
                right[1]--;
                rowIndex ++;
                columnIndex --;
            }

            // 竖向下
            if(rowIndex <= right1[0] && columnIndex == right1[1]){
                while (rowIndex <= right1[0]){
                    res.add(matrix[rowIndex][columnIndex]);
                    rowIndex ++;
                }
                right1[0] --;
                right1[1]--;
                rowIndex --;
                columnIndex --;
            }

            // 横向左
            if(columnIndex >= left1[1] && rowIndex == left1[0] ){
                while (columnIndex >= left1[1]){
                    res.add(matrix[rowIndex][columnIndex]);
                    columnIndex --;
                }
                left1[0] --;
                left1[1]++;
                rowIndex --;
                columnIndex ++;
            }

            // 竖向上
            if(rowIndex >= left[0] + 1 && columnIndex == left[1] && rowIndex <= left1[0]){
                while (rowIndex >= left[0] + 1){
                    res.add(matrix[rowIndex][columnIndex]);
                    rowIndex --;
                }
                left[0] ++;
                left[1]++;
                rowIndex ++;
                columnIndex ++;
            }

        }
        return res;
    }
}
