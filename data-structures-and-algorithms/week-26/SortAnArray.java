package data-structures-and-algorithms.week-26;

public class SortAnArray {
    public int[] SortAnArray(int[] nums) {
        MergeSort(nums, 0, nums.length-1);
        return nums;
    }
    
}
