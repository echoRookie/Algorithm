import java.util.Stack;

public class CalPoints {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i<ops.length; i++){
           if(ops[i].equals("C")){
               stack.pop();
           }
           else if(ops[i].equals("D")){
               stack.push(stack.peek() *2);
           }
           else if(ops[i].equals("+")){
               int a = stack.pop();
               int b = stack.peek();
               stack.push(a);
               stack.push(a+b);
           }
           else {
               stack.push(Integer.valueOf(ops[i]));
           }
        }
        int res = 0;
        while (!stack.isEmpty()){
            res += stack.pop();
        }
        return res;
    }
}
