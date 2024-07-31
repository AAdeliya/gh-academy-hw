public class SortColors {
    public void sortcolors(int[] nums){
        int low = 0;
        int med = 0;
        int high = nums.length-1;

        while(med<= high){
            if(nums[med] == 0){
                int temp = nums[low];
                nums[low] = nums[med];
                low++;
                med++;


            }else if(nums[med] == 1){
                med++;
                
            }else if(nums[med] == 2){
                int temp = nums[med];
                nums[med] = nums[high];
                high--;

            }
        }

    }
    
}
