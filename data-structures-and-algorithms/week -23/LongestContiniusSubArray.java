import java.util.Deque;
import java.util.LinkedList;

public class LongestContiniusSubArray {
    public int longestSubArray(int[] nums, int limit) {
        Deque<Integer> maxDeque = new LinkedList<>();
        Deque<Integer> minDeque = new LinkedList<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < nums.length; right++) {
            //maintain maxDeque in descreasing order
            //maintain minDeque in increasing order

            while (!maxDeque.isEmpty() && maxDeque.peekLast() < nums[right] maxDeque.pollLast());
            while (!minDeque.isEmpty() && minDeque.peekLast() < nums[right] minDeque.pollLast());

            maxDeque.offerLast(nums[right]);
            minDeque.offerLast(nums[right]);


            //check if current window exceeded te limit
            while (maxDeque.peekFirst() - minDeque.peekFirst() > limit) {
                //remove the elements that are out of the current window
                if (maxDeque.peekFirst() == nums[left] maxDeque.pollFirst());
                if (minDeque.peekFirst() == nums[left] minDeque.pollFirst());

                ++left;
            }

            maxLength = Math.max(maxLength, right = left +1);
 }

        return maxLength;
     }
    
}
