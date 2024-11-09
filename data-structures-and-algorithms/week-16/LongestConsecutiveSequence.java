import java.util.Set;

public class LongestConsecutiveSequence {
    public int LongestConsecutiveSequence(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n:nums) { 
            set.add(n);

        }
       
    

    int longest_streak = 0;
    for (int n: set) {
        if (!set.contains(n-1)) {
            int streak_start = n;
            int streak_end = n;

            while (set.contains(streak_end +1)) {
                streak_end++;
            }

            longest_streak = Math.max(longest_streak, streak_end - streak_start+1);

        }
    }
    return longest_streak;
    }
    


//     public int longestConsecutive(int[] nums) {
//         if (nums.length <= 1) {
//          return -1;
//  }
//              int count = 1;
 
//              Arrays.sort(nums);
//              for (int i = 0; i<nums.length-1; i++) {
//                  if (nums[i + 1] - nums[i] == 1) {
//                      count++;
 
//                       }
//              }
 
//                       return count;
//              }
//      }
     
