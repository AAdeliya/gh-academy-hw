import java.util.Stack;

public class DailyTemperatures {
    public int[] DailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] nge = new int[n];

        Stack<Integer> stack = new Stack<>();
        for (int i = n-1; i>=0; i--) {
            while (!stack.isEmpty() && temperatures[stack.peek()] <= temperatures[i]]) {
                stack.pop();

            }

            if (!stack.isEmpty()) {
                nge[i] = stack.peek() - i;
            }

            stack.push(i);

        }

        return nge;
    }
}
