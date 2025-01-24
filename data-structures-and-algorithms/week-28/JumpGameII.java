package data-structures-and-algorithms.week-28;

public class JumpGameII {
    public int jump(int[] nums) {
        //minimum number of jumps it takes to reach last index
        int jumps = 0;

        //current ' window'
        int currentLeft = 0;
        int currentRight = 0;

        //current 'horizon' that we can reach from current 'window'
        int currentFarthest = 0;

        //iterate until currentFarthest is >= nums.length - 1,
        //i.e until the last index is within the horizon.

        while (currentFarthest < nums.length - 1) {
            //compute what's the visible 'horizon', i.e what's the farthest 
            //position we can reach from the current 'window' of positions

            for (int i = currentLeft; i <= currentRight; i++) {
                currentFarthest = Math.max(currentFarthest, i + nums[i]);
            }

            //in this iteration, our window was [currentLeft; currentRight].
            //in the next iteration, we will check how far we can get from 
            //[currentRight + 1; currentFarthest].

            currentLeft = currentRight + 1;
            currentRight = currentFarthest;

            //we increment jum ps by 1
            //explanation: we can reach all positions up to 
            //currentFarthest using 'jumps' jumps.
            jumps++;
        } 

        return jumps;

    }

}
