package data

import java.util.Map;

-structures-and-algorithms.week-4;

public class ContiguousArray {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map =  new HashMap<>();
        map.put(0, -1);
        int maxLen = 0;
        int prefix = 0;
        for (int i = 0; i < nums.length; i++) {
            prefix += (nums[i] == 0) ? -1 : 1;

            if (map.containsKey(prefix)) {
                maxLen = Math.max(maxLen, map.get(prefix));
            } else {
                map.put(prefix, i);
            }

            return maxLen;

        }
    }
    
}
