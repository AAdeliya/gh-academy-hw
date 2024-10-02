import java.util.Stack;

public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        int a,b;

        Stack<Integer> stack = new Stack<>();
        for (String op : tokens) {
            if(op.equals("+")) {
                stack.add(stack.pop() + stack.pop());
            } else if (op.equals("*")){
                stack.add(stack.pop() * stack.pop());

            } else if(op.equals("-")) {
                b = stack.pop();
                a = stack.pop();
                stack.add(a-b);
            } else if(op.equals("/")) {
                b = stack.pop();
                a = stack.pop();
                stack.add(a/b);

            } else {
                stack.add(Integer.parseInt(op));
            }

            return stack.pop();
        }
    }
}
