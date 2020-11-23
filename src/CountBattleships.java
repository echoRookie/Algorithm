/*
 * 另一种解法：若发现战舰的舰头， 则继续向下或者向右查找，并将它们board[][] == '.', 类似200题岛屿下沉*/
public class CountBattleships {
    public static void main(String[] args) {
        System.out.println(countBattleships(new char[][]{{'X', '.', '.', 'X'}, {'.', '.', '.', 'X'}, {'.', '.', '.', 'X'}}));
    }

    public static int countBattleships(char[][] board) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'X') {
                    if (isValidation(i, j, board)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static boolean isValidation(int row, int column, char[][] board) {
        boolean res = true;
        if (row - 1 >= 0) {
            res = res && board[row - 1][column] != 'X';
        }
        if (column - 1 >= 0) {
            res = res && board[row][column - 1] != 'X';
        }
        return res;
    }
}
