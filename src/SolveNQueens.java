import java.util.ArrayList;
import java.util.List;

public class SolveNQueens {
    public static void main(String[] args) {
        SolveNQueens solveNQueens = new SolveNQueens();
        List<List<String>> result = solveNQueens.solveNQueens(5
        );
        for (List<String> a : result
        ) {
            String string = "";
            for (String str : a
            ) {
                string = str + string;
            }
            System.out.println(string);
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> trace = new ArrayList<>();
        backtrace(n, result, trace, 0);
        for (List<Integer> a : result
        ) {
            String string = "";
            for (Integer str : a
            ) {
                string = str + string + "  ";
            }
            System.out.println(string);
        }
        List<List<String>> res = new ArrayList<>();
        for(int i =0; i< result.size(); i++){
            List<Integer>  list = result.get(i);
            List<String> strList = new ArrayList<>();
            for(int j = 0; j< list.size(); j++){
                char[] chars = new char[n];
                for (int k =0; k< n; k++) chars[k] = '.';
                chars[list.get(j)] = 'Q';
                strList.add(String.valueOf(chars));
            }
            res.add(strList);
        }
        return res;
    }
    public void backtrace(int n, List<List<Integer>> result, List<Integer> trace, int start){
        if(start == n){
            result.add(new ArrayList<>(trace));
            return;
        }
        for (int i = 0; i < n; i++){
             if(check(trace, start, i))
                 trace.add(i);
             else continue;
             backtrace(n, result, trace, start+1);
             trace.remove(trace.size() -1);
        }

    }
    // 判断是否可以存放
    public boolean check(List<Integer> trace, int row, int col){
        boolean flag = true;
        for(int i =0;i< trace.size(); i ++){
            if(i == row){
                flag =  false;
                break;
            }

            if(trace.get(i) == col){
                flag = false;
                break;
            }

            if((row - i)/(double) (col -trace.get(i)) ==1 || (row - i)/ (double)(col -trace.get(i)) ==-1 ){
                flag = false;
                break;

            }

        }
        return  flag;
    }
}
