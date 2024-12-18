package data-structures-and-algorithms.week-26;

public class mergeSortedArray {
    public int merge(int[] nums1, int m, int nums2[], int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while (i >= 0 && j>=0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
    
}


//Azret's solution
int tail1 = m-1; /// pointer at the largest value
int tail2 = n-1; //pointer at the largest value in nums2
int insertPosition = m+n-1; // the very end of nums1, where we will start
                            //putting the merging arrays nums1 and nums2.
                            //keep merging until we run out of elements in nums2.
                            while (tail2 >= 0) {
                                if (tail1 >= 0 && nums1[tail1] > nums1[tail2]) {
                                    //if nums1 has the next element, and if it is 
                                    //greater than the next element in nums2, then
                                    //put the next element from nums1 in te insertPosition
                                    //and decrement both insertPosition and tail.

                                    nums1[insertPosition--] = nums1[tail1--];

                                } else {
                                    //othwise, put the next elemetn from nums2
                                    //in the insertPosiiton and decrement both
                                    //insertPosiiton and tail2.
                                    
                                    numss2[insertPosition--] = nums2[tail2];
                                
                                }
                            }