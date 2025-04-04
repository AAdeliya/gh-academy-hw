public class SortColors {
    public void sortcolors(int[] nums){
   int low = 0;
   int mid = 0;
   int high = nums.length-1;

   while(mid<=high){
    if(nums[mid] == 0){
        int temp  = nums[low];
        nums[low] = nums[mid];
        nums[mid] = temp;
        low++;
        mid++;

    }else if(nums[mid] == 1){
        mid++;

    }else if(nums[mid] == 2){
        int temp = nums[mid];
        nums[mid] = nums[high];
        nums[high] = temp;
        high--;
        

    }
   }


    }
}

public void sortColors(int[] nums) {
    int low = 0;
    int mid = 0;
    int high = nums.length - 1;
    
    while (mid <= high) {
        if (nums[mid] == 0) {
            // Swap nums[low] and nums[mid]
            int temp = nums[low];
            nums[low] = nums[mid];
            nums[mid] = temp;
            low++;
            mid++;

        } else if (nums[mid] == 1) {
            mid++;
        } else if (nums[mid] == 2) {
            // Swap nums[mid] and nums[high]
            int temp = nums[mid];
            nums[mid] = nums[high];
            nums[high] = temp;
            high--;
            
        }
    }
}
