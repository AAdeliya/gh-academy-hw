package data-structures-and-algorithms.week-4;

public class FindtheDuplicateNumber {
    public int findtheDuplicateNumber(int[] nums) {
        //initial thought - too slow
        // Arrays.sort(nums);
        // int duplicate = 0;
        // for (int i = 0; i < nums.length - 1; i++) {
        //     if (nums[i] == nums[i + 1]) {
        //         duplicate = nums[i];
        //     }
        // }

        // return duplicate;


        //Floyd Cycle Algorithm

        int slow = 0;
        int fast = 0;
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
            slow = 0;
            while (slow != fast) {
                slow = nums[slow];
                fast = nums[fast];
            }

            return slow;

    }
    
}
