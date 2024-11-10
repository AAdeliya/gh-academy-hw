import java.util.Map;

public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int currentPrefixSum = 0;
        int answer = 0;
        Map<Integer, Integer> prefixSumSeenCount = new HashMap<>();
        prefixSumSeenCount.put(0,1);
        for (int i = 0; i<nums.length; i++) {
            currentPrefixSum+=nums[i];

            answer+=prefixSumSeenCount.getOrDefault(currentPrefixSum-k, 0);

            prefixSumSeenCount.put(prefixSumSeenCount.get(currentPrefixSum, 0) +1);

        }

        return answer;










    //     public int subarraySum(int[] nums, int k) {
    //         if (nums.length<=1) {
    //            return -1;
       
    //         }
    //         int count = 0;
    //         for (int i = 0; i<nums.length; i++) {
    //            int currentSum = 0;
    //                for (int j = i; j < nums.length; j++) {
    //                    currentSum += nums[j];
    //                    if (currentSum == k) {
    //                        count++;
    //                    }
    //                }
    //            }
    //            return count;
    //        }
    //    }
       
    }
}
