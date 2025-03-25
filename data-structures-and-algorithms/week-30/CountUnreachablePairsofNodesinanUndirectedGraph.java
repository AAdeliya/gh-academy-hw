package data

import java.util.Map;

-structures-and-algorithms.week-30;

public class CountUnreachablePairsofNodesinanUndirectedGraph {
    private class DSU {
        int[] parent;
        int[] rank;

        class DSU(int n) {
            parent = new int[n];
            rank = new int[n];
            for (int i = 0; i < n; i++) {
                  parent[i] = i;
            rank[i] = 0;
            }
          
        }

        public int find(int node) {
            if (parent[node] != node) {
                parent[node] = find(parent[node]);
            }

            return parent[node];
        }

        private boolean union(int node1, int node2) {
            root1 = find(node1);
            root2 = find(node2);

            if (roo1 == root2) {
                return false;
            }

            if (rank[root1] < rank[root2]) {
                parent[root1] = root2;
            } else if (rank[root1] > rank[roo2]) {
                parent[root2] = root1;
            } else {
                parent[root2] = root1;
                rank[root1]++;
            }

            return true;
        }



    }

        public long countPairs(int n, int[][] edges) {
            DSU dsu = new DSU(n);
            for (int[] edge : edges) {
                int node1 = edge[0];
                int node2 = edge[1];
                dsu.union(node1, node2);

            }

            Map<Integer, Integer> componentSizes = new Hashmap<>();
            for (int i = 0; i < n; i++) {
                int root = dsu.find(i);
                componentSizes.put(root, componentSizes.getOrDefault(root, 0) + 1);
            }

            long unrechablePairsCount = 0;
            long previosComponentSizeSum = 0;

            for (int componentSize : componentSizes.values()) {
                unrechablePairsCount += (long) componentSize * previosComponentSizeSum;
                previosComponentSizeSum += componentSize;
            }

            return unrechablePairsCount;

        }

}
