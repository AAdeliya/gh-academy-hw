package data-structures-and-algorithms.week-6;

public class BeautifulArrangement {
     int res = 0;
    public int countArrangements(int n) {
        if (n == 0) return 0;
        boolean[] used = new boolean[n + 1]; //1-index based
        backtrack(1, n, used);
        return res;

    }

    private void backtrack(int pos, int n, boolean[] used) {
        if (pos > n) { //base case if all positions filled
            res++;
            return;
        }

        for (int i = 1; i <=n; i++) {
            if (!used[i] && (i % pos == 0 || pos % i == 0)) {
                used[i] = true; //mark i as used 
                backtrack(pos + 1, n, used);
                used[i] = false; //mark i as unused 
            }
        }
    }
}
