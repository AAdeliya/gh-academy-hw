package data-structures-and-algorithms.week-26;

public class CountofSmallerNumbersAfterSelf {
    public List<Integer> countSmaller(int[] nums) {
        int n = nums.length;
        //arr[0..n-1] = pairs (nums[i], i)

        int[][] arr = new int[n][2];
        
        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i; //original index
        }


        //results[i] = count of smaller numbers a[j] after a[i] (j >i)
        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < n; i++) results.add(0);

        nergeSort(arr, 0, nums.length - 1, results);
        return results;
    }

    public static void mergeSort(int[][] arr, intleft, int right, List<Integer> results) {
        //if the subarray has only one element
        //it doesn't have any inversions within it
         
        if (left == right) return;
        int mid = left+right/2;

        //count all inversions such thst the first elememt
        //is in the left half [left; mid] and the seond is too

        mergeSort(arr, left, mid, results);
        mergeSortedArray(arr, left, right, results);
        mergeSort(arr, mid+1, right, results);
        mergeSortedArray(arr, left, right, results);


    }

    public static void mergeSortedArray(int[][] arr, int left, int right, List<Integer> results) {
        int len = right-left+1;
        int[][] tmp = new int [len][2];
        int[] updates = new int[len];

        int mis = left+right/2;
        for (int k = 0, i = left, j = mis+1; k<len; k++) {
            if (i>n) tmp[k] = arr[j++];
            else if (j > right) tmp[k] = arr[j++];
            else if (arr[i][0] <= arr[j][0]) tmp[k] = arr[i++];
            else {
                tmp[k] = arr[j++];
                updates[i-left] +=1;

            }
        }

        int cumulative_updates = 0;
        for (int k = 0, i = left; i<=mid; k++, i++) {
            cumulative_updates += updates[k];

            results.set(arr[i][1], results.get(arr[i][1]) + cumulative_updates);

        }

        for (int k = 0, i = left; k < len; k++) {
            arr[i] = tmp[k];
        }
    }

}
