import java.util.Stack;

public class BaseballGame {
    public int baseballGame(String[] operations) {
    Stack<Integer> stack = new Stack<>();

    for (String op : operations) {
        if (op.equals("+")) {
            stack.push(stack.peek() + stack.get(stack.size() - 2));

        } else if (op.equals("D")) {
            stack.push(stack.peek() * 2);
        } else if (op.equals("C")) {
            stack.pop();
        } else {
            stack.push(Integer.parseInt(op));
        }

        }

        int sum = 0;
        for (int score : stack) {
            sum+=score;

        }
    
    
        return sum;

    }
}
    
    
  

