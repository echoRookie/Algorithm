import java.util.ArrayList;
import java.util.List;

/*给定一个整数 n，返回 n 皇后不同的解决方案的数量。

        示例:

        输入: 4
        输出: 2
        解释: 4 皇后问题存在如下两个不同的解法。
        [
         [".Q..",  // 解法 1
          "...Q",
          "Q...",
          "..Q."],

         ["..Q.",  // 解法 2
          "Q...",
          "...Q",
          ".Q.."]
        ]*/
public class TotalNQueens {
    public static void main(String[] args) {
        TotalNQueens totalNQueens = new TotalNQueens();
        int size = totalNQueens.totalNQueens(5);
        /*for (List<String> a : result
        ) {
            String string = "";
            for (String str : a
            ) {
                string = str + string;
            }
            System.out.println(string);
        }*/
        System.out.println(size);
    }
    public  int totalNQueens(int n) {
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

        return result.size();
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
