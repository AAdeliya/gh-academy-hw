public class MergeArrayByParity {
    public void merge(int[] nums1, int p1, int[] nums2, int p2){
        int i = p1-1;
        int j = p2-1;
        int k=p1+p2-1;

        while(nums1[i]>=0 && nums2[j]>=0){
            if(nums1[i]>nums2[j]){
                nums1[k] = nums1[i];
                i--;
                j--;


            }else {
                nums1[k] = nums2[j];
                j--;
                k--;

            }

        }
        while(j>=0){
            nums1[k] = nums2[j];
            j--;
            k--;
            
        }

        

    }

    
}
