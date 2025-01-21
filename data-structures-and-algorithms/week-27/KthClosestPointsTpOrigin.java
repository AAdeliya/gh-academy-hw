package data

import java.util.Random;

-structures-and-algorithms.week-27;

public class KthClosestPointsTpOrigin {
    // Kth smallest distances to the origin and we need to find indeces to these
    // points
    // we do partitioning
    // we want kth smallest element move to the left

    public int[][] kClosest(int[][] points, int k) {
        int n = points.length;
        //creating 2D array of pairs 
        //distance and indees travel together

        int[][] dist_index = new int[n][2];
        for (int i = 0; i < n; i++) {
            //x^2+y^2
            dist_index[i][0] = points[i][0] * points[i][0] + points[i][1]* points[i][1];

            //index in original array 
            dist_index[i][1] = i;
        }

        //when we are calling algorithm we asking array to partition an array in 
        //such a way k-1 smallest element is added index where it should be 
        //and to the left of it we have points that are closer than k-1 point
        //and to the right of index k - 1we have points that are futher than k - 1 points 
        //from the origin 

        quickSelect(dist_index, 0, n - 1, k - 1);
        int[][] answer = new int[k][2];


        //the first k indexes from 0 to k - 1 are going to be the one that we want 
        for (int i = 0; i < k; i++) {

            //we are taking origin points 
            //we are copying them to the answer 
            //and return the answer 
            answer[i] = points[dist_index[i][1]];

        }

        return answer;
    }

    private static void quickSelect(int[][] arr, int left, int right, int k) {
        //take a random pivot from the whole range
        Random rand = new Random();
        int randIndex = rand.nextInt(left, right + 1);
        swap(arr, left, randIndex);

        int pivot = arr[left][0];
        int storeIndex = left + 1;
        for (int i = left + 1; i <= right; i++) {
            if(arr[i][0] < pivot) {
                swap(arr, i, storeIndex);
                storeIndex++;
            }
        }

        swap(arr, left, storeIndex - 1);
        int l = storeIndex - 2;
        int r = storeIndex;
        while (l >= left && arr[l][0] == pivot) l--;
        while (r <= right && arr[r][0] == pivot) r++;

        if (l + 1 <= k && k <= r - 1) return;
        if (k <= l) quickSelect(arr, left, l, k);
        else quickSelect(arr, r, right, k);
    }

    private static void swap(int[][] arr, int i, int j) {
        // we are taking the whole pair int[] tmp
        // swapping two pairs
        int[] tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}
