import java.util.Arrays;
import java.util.List;

class Solution {
    List<List<String>> res = new ArrayList<>();;
    boolean[] col, dia1, dia2;
    
    public List<List<String>> solveNQueens(int n) {
        col = new boolean[n];
        dia1 = new boolean[2 * n - 1];
        dia2 = new boolean[2 * n - 1];
        
        List<Integer> row = new ArrayList<>();
        putQueen(n, 0, row);
        return res;
    }
    
    private List<String> generateBoard(int n, List<Integer> row){
        List<String> board = new ArrayList<>(Arrays.asList(new String[n]));
        char[] chars = new char[n];
        for(int i = 0; i < n; i++){
            chars[i] = '.';
        }
        for(int i = 0; i < n; i++){
            chars[row.get(i)] = 'Q';
            board.set(i, new String(chars));
            chars[row.get(i)] = '.';
        }
        return board;
        
    }

    private void putQueen(int n, int index, List<Integer> row){
        if(index == n){
                res.add(new ArrayList<String>(generateBoard(n, row)));
            return;
        }
        
        for(int i = 0; i < n; i++){
            if(!col[i] && !dia1[index + i] && !dia2[index - i + n - 1]){
                row.add(i);
                col[i] = true;
                dia1[index + i] = true;
                dia2[index - i + n - 1] = true;
                putQueen(n, index + 1, row);
                col[i] = false;
                dia1[index + i] = false;
                dia2[index - i + n - 1] = false;
                row.remove(row.size() - 1);
            }
        }
       // return;
    }
}