public class RangeSumQuery {
    int[] prefix; //array to store prefix sum

    public void NumArray(int[]nums){
        int n = nums.length; //length of input array 
        prefix = new int[n+1]; //initialize the prefix sum array with size n+1
        prefix[0] = 0; //base case : prefix sum ar index 0 is 0
        for (int i = 1; i<=n; i++) {
            prefix[i] = prefix[i-1] + nums[i-1]; //compute prefix sum

        }
    }

    public int sumRange(int left, int right) {
        left++; right++;

        return prefix[right] + prefix [right-1];
    }
    }
    
