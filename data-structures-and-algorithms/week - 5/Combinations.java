package data-structures-and-algorithms.week - 5;
import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public List<List<Integer>> comb(int nums, int k) {
        List<List<Integer>> list = new ArrayList<List<List<Integer>>();
        comb(list, new ArrayList<Integer>(), 1, nums, k);
        return list;
    }

    private void comb(List<List<Integer>> list, List<Integer> tempList, int start, int nums, int k ) {
        if (k == 0) {
            list.add(new ArrayList<Integer>(tempList));
            return;
        }

        for (int i = start; i <= nums; i++) {
            list.add(i);
            comb(list, tempList, i + 1, nums, k - 1);
            tempList.remove(tempList.size() - 1);
        }
    }
    
}
