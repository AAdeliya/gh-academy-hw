package data-structures-and-algorithms.week-28;

public class JumpGame {
    public boolean canJump(int[] nums) {
        if (nums.length == 1) {
            return true;
        }

        int i = 0;
        int reach = 0;
        for (; i < nums.length; i++) {
            if (i > reach) {
                break;
            }
            // if it is possible to reach the current index,
            // if should also be possible to reach indices up to i+nums[i].
            //Extend the reach, if possible

            reach = Math.max(i + nums[i], reach);

            //if it became possible to reach the last index.
            //return true
            
            if (reach >= nums.length - 1) {
                return true;
            }
        }

        return false;
    }

}
