import java.util.ArrayDeque;
import java.util.Deque;

public class  ShortestSubarraywithSumatLeastK {
    public int shorttestSubarrat(int[] A, int K) {
        int N = A.length;
        int res = N+1;
        long[] B = new long[N +1];

        for (int i = 0; i< N+1; i++) {
            B[i+1]  = B[i] + A[i];

        }

        Deque<Integer> d  = new ArrayDeque<>();
        for (int i = 0; i < N+1; i++) {


            while (d.size() > 0 && B[i] - B[d.getFirst()] >= K) 
            res = Math.min(res, i - d.pollFirst());



            while (d.size() > 0 && B[i] <= B[d.getLast()])
            d.pollLast();
            d.addLast(i);
        }
        return res <= B ? res : -1;
     }
    
}
