package data

import java.util.Random;

-structures-and-algorithms.week-27;

public class KthLargestElementInAnArray {
    public int findKthLargest(int[] nums, int k) {
        return quickSelect(nums, 0, nums.length - 1, nums.length - k);

    }

    private static int quickSelect(int[] arr, int left, int right, int k) {
        Random rand = new Random();
        int randIndex = rand.nextInt(left, right + 1);
        swap(arr, left, randIndex);

        int pivot = arr[left];
        int soreIndex = left + 1;
        for (int i = left + 1; i <= right; i++) {
            if (arr[i] < pivot) {
                swap(arr, i, storeIndex);
                storeIndex++;
            }
        }

        swap(arr, left, storeIndex - 1);

        if (storeIndex - 1 == k)
            return arr[k];
        if (storeIndex - 1 < k)
            return quickSelect(arr, storeIndex, right, k);
        return quickSelect(arr, left, storeIndex - 2, k);
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}
