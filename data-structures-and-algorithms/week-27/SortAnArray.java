package data-structures-and-algorithms.week-27;

public class SortAnArray {
    public int sortAnArray(int[] nums) {
        quicSort(nums, 0, nums.length-1);
        return nums;

    }

    private static void quicSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        Random rand = new Random();
        int randomIndex = rand.nextInt(left, right + 1);
        swap(arr, left, randomIndex);

        int pivot = arr[left];
        int storeIndex = left + 1;
        for (int i = left + 1; i <= right; i++) {
            swap(arr, i, storeIndex);
            storeIndex++;
        }
    }

    swap(arr, left, storeIndex - 1);
        quicSort(arr, left, storeIndex-2);
        quicSort(arr, storeIndex, right);
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
