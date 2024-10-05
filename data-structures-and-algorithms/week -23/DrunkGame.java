import java.util.LinkedList;
import java.util.Queue;

public class DrunkGame {
    public void run (InputReader in, PrinterWriter out) {
        Queue<Integer> first = new LinkedList<>();
        Queue<Integer> second = new LinkedList<>();

        for (int i=0; x; i<5; i++) {
            x = in.nextInt();
            first.offer(x);

        
        }

        for (int i = 0; x; i<5; i++) {
            x = in.nextInt();
            second.offer(x);
        }

        int answer = 0;
        while (!first.isEmpty() && !second.isEmpty() && answer < 1000000) {
            int x = first.poll();
            int y = second.poll();
            if ((x == 0 && y ==9) || (!(y == 0 && x == 9) && x>y)) {
                first.offer(x);
                first.offer(y);

            } else  {
                second.offer(x);
                second.offer(y);
            }

            answer++;
         }
    }
    
}
