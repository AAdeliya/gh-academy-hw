package data-structures-and-algorithms.week - 25;

public class hIndex {
    public int hIndex(int[] citations) {
        int n = citations.length;

        // Step 1: Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            boolean isSorted = true; // Assume array is sorted at the start
            for (int j = 0; j < n - i - 1; j++) {
                if (citations[j] > citations[j + 1]) {
                    // Swap citations[j] and citations[j + 1]
                    int temp = citations[j];
                    citations[j] = citations[j + 1];
                    citations[j + 1] = temp;
                    isSorted = false; // Array was not sorted
                }
            }
            if (isSorted) {
                break; // Stop early if no swaps occurred
            }
        }
    
        // Step 2: Calculate H-Index
        int hIndex = 0;
        for (int i = 0; i < n; i++) {
            int h = n - i; // Number of papers with at least citations[i] citations
            if (citations[i] >= h) {
                hIndex = h; // Update hIndex
                break;      // Stop as we found the maximum h-index
            }
        }
    
        return hIndex;
    
    }
    
}
