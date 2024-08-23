public class FindMinimumInRotatedArray {
    public int findMin(int[] nums) {
        int n = nums.length;

        if (nums == null || n == 0) {

        if (n == 1) return nums[0];

        if (nums[0] < nums[n-1]) return nums[0];

        int left = 0;
        int right = nums.length - 1;

        while (left<=right) {
            int middle = (left+right)/2;

        if(middle > 0 && nums[middle - 1] > nums[middle]) return nums[middle];

        

        if(nums[middle] > nums[right]) {
            left = middle+1;

        } else {
            right = middle-1;
        }

        }
       
    }
        return -1;
    }
}
    

