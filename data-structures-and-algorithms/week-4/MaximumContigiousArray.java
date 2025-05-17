package data-structures-and-algorithms.week-4;

public class MaximumContigiousArray {
    public int maxSum(int[] nums) {
        int res = nums[0];
        int total = 0;
        for (int n : nums) {
            if (total < 0) {
                total = 0;
            }

            total += n;
            res = Math.max(res, total);
        
        }

        return res;
    }
    
}
