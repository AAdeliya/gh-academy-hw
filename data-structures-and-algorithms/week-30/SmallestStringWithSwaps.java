import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class SmallestStringWithSwaps {
   
        private class DSU {
            int[] parent;
            public DSU(int n) {
                parent = new int[n];
                for (int i = 0; i < n; i++) {
                    parent[i] = i;
                }
            }

            public int find(int index) {
                if (parent[index] != index) {
                    parent[index] = find(parent[index]);
                }
                return  parent[index];
            }

            public boolean union(int index1, int index2) {
                int root1 = find(index1);
                int root2 = find(index2);

                if (root1 != root2) {
                    parent[root1] = root2;
                    return true;
                }

                return false;
            }
        }

        public String smallestStringWithswaps(String s, List<List<Integer>> pairs) {
            int n = s.length();
            DSU dsu = new DSU(n);

            for (List<Integer> pair : pairs) {
                int index1 = pair.get(0);
                int index2 = pair.get(1);
                dsu.union(index1, index2);
            }

            Map<Integer, List<Integer>> componentIndices = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int root = dsu.find(i);
                componentIndices.computeIfAbsent(root, k-> new ArrayList<>()).add(i);

                
            }

            char[] resultCharArray = s.toCharArray();
            for (List<Integer> indices : componentIndices.values()) {
                List<Character> characters = new ArrayList<>();
                for (int index : indices) {
                    characters.add(s.charAt(index));
                }

                Collections.sort(characters);

                for (int i = 0; i < indices.size(); i++) {
                    resultCharArray[indices.get(i)] = characters.get(i);
                }
            }

            return new String(resultCharArray);

        }
    }
    
