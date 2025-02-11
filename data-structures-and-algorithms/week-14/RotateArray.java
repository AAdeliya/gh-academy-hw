

public class RotateArray {
public void rotate(int[] nums, int k){
    k%=nums.length;
    reverse(nums, 0, nums.length-1);
    reverse(nums, 0, k-1);
    reverse(nums, k, nums.length-1);

}
public void reverse(int[] nums, int start, int end){
    while(start<end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;

    }
}


    
}


//k=3 i shows the number of rotate 
// [1,2,3,4,5,6,7]
//1. [7,1,2,3,4,5,6]
//2.[6,7,1,2,3,4,5]
//3.[5,6,7,1,2,3,4]


class Solution {
    public void rotate(int[] nums, int k) {
     k %= nums.length;
     reverse(nums, 0, nums.length - 1);
     reverse(nums, 0, k - 1);
     reverse(nums, k, nums.length - 1);
 }
 
 public void reverse(int[] nums, int start, int end) {
     while (start < end) {
         int temp = nums[start];
         nums[start] = nums[end];
         nums[end] = temp;
         start++;
         end--;
     }
 }
 }
