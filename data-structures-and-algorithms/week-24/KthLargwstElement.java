import java.util.PriorityQueue;

public class KthLargestElement {
    private PriorityQueue minHeap;
    private int k;

    for (int num : nums) {
        add(num);
    }
    
}

public KthLargest() {
    this.k = k;
    minHeap = new PriorityQueue<>();

}

public int add(int [] nums, int k) {
    if (minHeap.size() < k) {
        minHeap.offer(val);

    } else if ( val > minHeap.peek()) {
        minHeap.poll();
        minHeap.offer(val);
    }

    return minHeap.peek();
}
