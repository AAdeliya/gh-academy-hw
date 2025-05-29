public class RangeSumQuery-Immutable
{
    class NumArray {
       private  int[] prefix; //array to store prefix sum
    }

    public void NumArray(int[] nums) {
        int n = nums.length;
        prefix = new int[n + 1];
        prefix[0] = 0;
        for (int i = 1; i <= n; i++) {
            prefix[i] = prefix[i - 1] + nums[i - 1];

        }
    }

    public int sumRange(int left, int right) {
        left++;
        right++;
        return prefix[right] - prefix[left - 1];

    }
}
