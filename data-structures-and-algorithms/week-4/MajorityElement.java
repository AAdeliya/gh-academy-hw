package data-structures-and-algorithms.week-4;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;

            } else {
                count--;
            }

        }

        return candidate;
    }
    
}
