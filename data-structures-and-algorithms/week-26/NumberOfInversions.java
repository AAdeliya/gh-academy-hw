
public class NumberOfInversions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.length;
        int[] nums = new int[n];
        for (int i = 0; i < n; n++) {
            nums[i] = in.nextLine();
        }

        System.out.println(countInversions(nums));
        return mergeSort(nums, 0, nums.length-1);
    }

    public static long mergeSort(int[] arr, int left, int right) {
        if (left == right) return 0;

        int mid = (left+right)/2;
        long result = 0;

        result += mergeSort(arr, left, right);
        return result;
    }

    public static long mergeSortedArrays(int[] arr, int left, int right) {
        int len = right-left+1;
        int[] tmp = new int[len];
        int mid = left+right/2;
        int inversions = 0;
        for (int k = 0, i = left, j=mid+1; k <len; k++) {
            if (i > mid) tmp[k] = arr[j++];
            else if (j > right) tmp[k] = arr[i++];
            else if (arr[i] < arr[j]) tmp[k] = arr[i++];
            else {
                tmp[k] = arr[j++];
                inversions += mid - i + 1;

            }
        }

        for (int k = 0, i = left; k < len; k++, i++) {
            arr[i] = tmp[k];
        }

        return inversions;
    }

    
}
