/*数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。

         

        示例：

        输入：n = 3
        输出：[
        "((()))",
        "(()())",
        "(())()",
        "()(())",
        "()()()"
        ]*/


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenerateParenthesis {
    public static void main(String[] args) {
        GenerateParenthesis generateParenthesis = new GenerateParenthesis();
        List<String> result = generateParenthesis.generateParenthesis(3);
        for (String a : result
        ) {
            System.out.println(a);
        }
    }

    public List<String> generateParenthesis(int n) {
        char[] nums = new char[]{'(', ')'};
        List<String> result = new ArrayList<>();
        StringBuilder s = new StringBuilder();

        backtrack(n, n, s, result, nums);
        return result;
    }

    public void backtrack(int left, int right, StringBuilder s, List<String> result, char[] nums) {
        if (left == 0 && right == 0) {
            result.add(s.toString());
            return;
        }
        if (right < left)
            return;
        if (right < 0 || left < 0)
            return;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == '(') {
                s.append(nums[i]);
                backtrack(left - 1, right, s, result, nums);
                s.deleteCharAt(s.length() - 1);
            } else {
                s.append(nums[i]);
                backtrack(left, right - 1, s, result, nums);
                s.deleteCharAt(s.length() - 1);
            }
        }
    }

}

