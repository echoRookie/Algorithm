/*
给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。

        示例:

        输入: n = 4, k = 2
        输出:
        [
        [2,4],
        [3,4],
        [2,3],
        [1,2],
        [1,3],
        [1,4],
        ]
*/

import java.util.ArrayList;
import java.util.List;

public class Combine {
    public static void main(String[] args) {
        Combine combine = new Combine();
        List<List<Integer>> result = combine.combine(2, 2);
        for (List<Integer> a : result
        ) {
            String string = "";
            for (Integer str : a
            ) {
                string = str + string + "  ";
            }
            System.out.println(string);
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        backtrace(n, k, result, list, 1);
        return result;
    }

    public void backtrace(int n, int k, List<List<Integer>> result, List<Integer> list, int start) {
        if (list.size() == k){
            result.add(new ArrayList<>(list));
            return;
        }


        for (int i = start; i <= n; i++) {
            list.add(i);
            backtrace(n, k, result, list, i + 1);
            list.remove(list.size() - 1);
        }

    }
}
