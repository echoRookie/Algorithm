/*
给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

        有效字符串需满足：

        左括号必须用相同类型的右括号闭合。
        左括号必须以正确的顺序闭合。
        注意空字符串可被认为是有效字符串。

        示例 1:

        输入: "()"
        输出: true
        示例 2:

        输入: "()[]{}"
        输出: true
        示例 3:

        输入: "(]"
        输出: false
        示例 4:

        输入: "([)]"
        输出: false
        示例 5:

        输入: "{[]}"
        输出: true
*/

import java.util.Stack;

public class IsValid {
    public static void main(String[] args) {
        IsValid isValid = new IsValid();
        System.out.println(isValid.isValid("()[]{}"));
    }
    public boolean isValid(String s) {
        Stack<Character> str = new Stack<>();
        for(int i = 0; i < s.length(); i ++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
                str.push(s.charAt(i));
            else {
                if(str.size() > 0 && translate(s.charAt(i)) == str.peek())
                    str.pop();
                else
                {
                    return false;
                }
            }
        }
        return str.size() == 0;
    }
    public char translate(char a){
        if(a == ')')
            return '(';
        else if(a == '}')
                return '{';
        else
            return '[';
    }
}
