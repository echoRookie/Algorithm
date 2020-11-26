/*
 * 1.题目要求原地算法，我们只能通过标记数组来实现
 * 2.如何解决在标记的同时我们不改变数组的的原有状态
 * 3.如何死细胞复活则让他小于0，没有改变数组的状态， 如果活细胞死亡则大于1， 原数组的0和1都不要处理
 * 4.遍历数组,找出大于1和小于0的改变其数值*/
public class GameOfLife {
    public static void main(String[] args) {
        int[][] res = new int[][]{{0, 1, 0}, {0, 0, 1}, {1, 1, 1}, {0, 0, 0}};
        gameOfLife(res);
        for (int i = 0; i < res.length; i++) {
            String str = "";
            for (int j = 0; j < res[0].length; j++) {
                str = str + res[i][j] + " ";
            }
            System.out.println(str);
        }
    }

    public static void gameOfLife(int[][] board) {
        //遍历数组标记细胞状态
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                //为活细胞时
                if (board[i][j] > 0) {
                    if (searchAlive(i, j, board) < 2 || searchAlive(i, j, board) > 3) {
                        //活-->死 将值加1，结果大于1
                        board[i][j]++;
                    }

                }
                //为死细胞时
                else {
                    if (searchAlive(i, j, board) == 3) {
                        //死-->活 将值减一，结果小于1
                        board[i][j]--;
                    }
                }
            }
        }
        //遍历数组修改细胞状态
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] > 1) {
                    board[i][j] = 0;
                }
                if (board[i][j] < 0) {
                    board[i][j] = 1;
                }
            }
        }
    }

    // 统计细胞周围8个位置的活细胞数量
    public static int searchAlive(int r, int c, int[][] board) {
//        int rowStart = r -1 < 0 ? 0: r -1;
//        int rowEnd = r + 1 > board.length -1? board.length -1 : r+1;
//        int columnStart = c- 1 < 0? 0: r-1;
//        int columnEnd = c+1>board[0].length -1?board[0].length -1: c+1;
        int count = 0;
        for (int i = r - 1; i <= r + 1; i++) {
            for (int j = c - 1; j <= c + 1; j++) {
                if (i < 0 || i > board.length - 1 || j < 0 || j > board[0].length - 1) {
                    continue;
                } else {
                    if (board[i][j] > 0 && !(r == i && c == j)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
