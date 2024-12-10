package data-structures-and-algorithms.week - 25;

public class MaximumProductsPairs {
    public int maxProductDifference(int[] nums) {
    //     int firstLargest = 0, secondLargest = 0;
    //     int firstSmallest = 10001, secondSmallest = 100001;
    //     for (int i = 0; i<nums.length; i++) {
    //         //update largest numsber
    //         if (nums[i] >= firstLargest) {
    //             secondLargest = firstLargest;
    //             firstLargest = nums[i];
    //         } else if (nums[i] > secondLargest) {
    //             secondLargest = nums[i];
    //         }

    //         //update smallest number
    //         if (nums[i] <= firstLargest) {
    //             secondSmallest = firstSmallest;
    //             firstSmallest = nums[i];

    //         } else if (nums[i] < secondSmallest) {
    //             secondSmallest = nums[i];
    //         }
    //     }

    //     return firstLargest*secondLargest  - firstLargest*secondSmallest;
    // }

//O(n)







        // public class maxProductDifference {
        //     public int maxProductDifference(int[] nums) {
        //         int maxDifference = 0;
        //         Arrays.sort(nums);
        //         maxDifference = (nums[nums.length - 1] * nums[nums.length - 2]) - (nums[0] * nums[1]);
        //         return maxDifference;
        
                //time complexity NlogN
                //7 ms beats 66.30%
        
        //O(n^2)
        
        //        Bubble sort 546 ms 5.01% beats
        //        int n = nums.length;
        //        for (int i = 0; i < n; i++) {
        //            for (int j = n-1; j >=i+1; j--) {
        //                if (nums[j] < nums[j-1]) {
        //                    int t = nums[j];
        //                    nums[j] = nums[j-1];
        //                    nums[j-1] = t;
        //
        //                }
        //            }
        //
        //        }
        //
        //        return (nums[n-1] * nums[n-2] - nums[1] * nums[0]);
        



        //493ms, beats 5.01%
        // int  n =nums.length;
        // for (int i = 0; i =n-1; i++) {
        //     boolean exchange_happened = false;
        //     for (int j = n-1; j>= i+1; i--) {
        //         if (nums[j] < nums[j-1]) {
        //             int t = nums[j];
        //             nums[j] = numms[j-1];
        //             nums[j-1] = t;
        //             exchange_happened = true;
        //         }


        //     }

        //     if (!exchange_happened) {
        //         break;





        //insertion sort 
        // 133 ms, beats 5.03%
        // int n = nums.length;
        // for (int i = 1; i<n; i++) {
        //     int key = nums[i];
        //     int j = i -1;
        //     while (j>= 0 && nums[j] > key) {
        //         nums[j+1] = nums[j];
        //         j--;
        //     }

        //     nums[j+1] = key;
        // }

        // return (nums[n-1] * nums[n-2]) - (nums[1] * nums[0]);
            
    
    
    


        //selection sort

        // 247 ms, 5.01%
        // int n = nums.length;
        // for (int i = 0; i<n -1; i++) {
        //     int smallest = i;
        //     for (int j = i+1; j<n; j++) {
        //         if (nums[i] < nums[smallest]) {
        //             smallest = j;
        //         }
        //     }

        //     int t = nums[i];
        //     nums[i] = nums[smallest];
        //     nums[smallest]  =t;
        // }

        // return (nums[n-1] * nums[n-2]) - (nums[1] * nums[0]);

    

        
        
        
        
        //Counting sort 
    //     int n = nums.length;
    //     int k = 10001;
    //     int[] b = new int[n];
    //     int [] c = new int[k+1];  ///indices from 0 to 10000
    //     for (int i = 0; i<=k ; i++) {
    //         c[i] = 0;
    //     }
    //     for (int j = 0; j<n ; j++) {
    //         c[nums[j]] ++;
    //     } for (int j = 1; j <=k; j++) {
    //         c[j] +=c[j-1];
    //     }
    //     for (int j = n-1; j>= 0; j--) {
    //         b[c[nums[j]] - 1] = nums[j];
    //         c[nums[j]]--;
    //     }
    
    // }
    //     }


    




    // Radix Sort  7 ms, 65.33%
    // public int[] radix_counting_sort(int[] nums, int div) {

    // int div = 1;
    // for (int i = 0; i<=4; i++) { //sort by 0th digit, 1st, 2nd, 3rd, and 4th.
    //     int nums = nums.length;
    //     int k = 9; //digit from 0 to 9
    //     int[] b = new int[n];
    //     int[] c = new int [k+1]; //indices from 0 to 9
    //     for (int i = 0; i<=k; i++) {
    //         c[i] = 0;
    //     }

    //     for (int j = 0; j<n; j++) {
    //         c[nums[j] /div %10]++;
    //     } for (int j = 1; j<=k; j++) {
    //         c[j] +==c[j-1];
    //     } for (int j = n-1; j>=0; j--) {
    //         b[c[nums[j] / div % 10] - 1] = nums[j];
    //         c[nums[j] / div % 10]--;

    //     }

    //     return b;

    }










            }



        }
        

   
