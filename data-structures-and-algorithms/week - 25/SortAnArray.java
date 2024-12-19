package data-structures-and-algorithms.week - 25;

public class SortAnArray {
    public int SortAnArray(int[] nums) {
    int[] counters = new int[1000001]; //0..100.000
    for (int x : nums) counters[x+500000]++;
    for (int i = 0; i<=100000; i++) {
        while (counters[i] > 0) { //when A frequnecy is end then move on to the B
            nums[cur++] = i - 500000; //come back to the initial value 
            counters[i]--; 
        }
        
    }

    return nums;
    }
    
}
