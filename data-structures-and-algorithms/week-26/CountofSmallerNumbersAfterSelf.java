package data-structures-and-algorithms.week-26;

public class CountofSmallerNumbersAfterSelf {
    public List<Integer> countSmaller(int[] nums) {
        int n = nums.length;
        //arr[0..n-1] = pairs (nums[i], i)

        int[][] arr = new int[n][2];
        for (int i = 0; i<n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i; //original index
        }

        //results[i] = count of smaller numbers a[j] after a[i] (j >i)
        List<Integer> results = new ArrayList<>();
        for (int i = 0; i< n; i++) results.add(0);

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

        
    }
    
}
