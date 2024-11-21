import java.util.Collection;
import java.util.Comparator;
import java.util.PriorityQueue;

public class FindMedianfromDataStream {
    private PriorityQueue<Integer> maxHeap;
    private PriorityQueue<Integer> minHeap;
    
    public MedianFinder() {
        maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        minHeap = new PriorityQueue<>();
 
        
    }
    
    public void addNum(int num) {
        if (maxHeap.isEmpty() || num <= maxHeap.poll()) {
            maxHeap.offer(num);
        } else {
            minHeap.offer(num);
        }

        if (maxHeap.size() > minHeap + 1) {
            minHeap.offer(maxHeap.poll());
        } else {
            maxHeap.offer(minHeap.poll());
        }
     
    }
    
    public double findMedian() {
        if (minHeap.size() == maxHeap.size()) {
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        } else {
            return maxHeap.peek();
        }
    
        
    }
}