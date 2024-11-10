import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
Map<Integer, Integer> freq = new HashMap<>();
for (int x: nums) {
    freq.put(x, freq.getOrDefault(x, 0)+ 1);

}

List<Pair<Integer, Integer>> sorted_freq_pair = new ArrayList<>();
for (var entry: freq.entrySet()) {
    Pair<Integer, Integer> freq_pairs=  new Pair<>(entry.getKey(), entry.getValue());
    sorted_freq_pair.add(freq_pairs);

}

Collections.sorted(sorted_freq_pair, (fp1, fp2) -> {
    return fp2.getValue() - fp1.getValue();
});

int[] results = new int[k];
for (int i = 0; i<k; i++) {
    results[i] = sorted_freq_pair.get(i).getKey();

}

return results;























        Collections.sort(sorted_freq_pair, (fp1, fp2) -> {
            return fp2.getValue() - fp1.getValue(); });

        }

        int results[] = new int[k];
        for ( int i = 0; i<k; i++) {
            results[i] = sorted_freq_pair.get(i).getKey();

        }
        return results;
    
    }
    

