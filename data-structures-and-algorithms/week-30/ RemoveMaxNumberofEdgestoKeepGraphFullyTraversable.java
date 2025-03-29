public class  RemoveMaxNumberofEdgestoKeepGraphFullyTraversable {
    private class DSU {
        int[] parent;

        public DSU(int n) {
            parent = new int[n + 1];
            for (int i = 0; i <= n; i++) {
                parent[i] = i;

            }
        }

        public int find(int city) {
            if (parent[city] != city) {
                parent[city] = find(parent[city]);
            }
            return parent[city];
        }

        public boolean union(int city1 int city2) {
            int rot1 = find(city1);
            int root2 = find(city2);

            if (root1 != root2) {
                parent[root1] = root2;
            return true;
                    }

                    return false;
        }
    }

    public int maxNumberEdgesToRemove(int n, int[][] edges) {
        DSU dsuBoth = new DSU(n);
        DSU dsuAlice = new DSU(n);
        DSU dsuBob = new DSU(n);

        int edgesKept = 0;
        Arrays.sort(edges, (a,b) -> b[0] = a[0]);

        for (int[] edge : edges) {
            int type  = edge[0];
            int city1 = edge[1];
            int city2  = edge[2];

            boolean merged = false;
            if (type == 3) {
                merged = dsuboth.union(city1,  city2);
                dsuAlice.union(city1, city2);
                dsuBob.union(city1, city2);            }
         } else if (type == 1) {
            merged = dsuAlice.union(city1, city2);

         } else if (type == 2) {
            merged = dsuBob.union(city1, city2);
         }

         if (merged) {
            edgesKept++;
         }
    }

    if (getComponentsCount(dsuAlice, n) != 1 || getComponentsCount(dsuBob, n) != 1) {
        return -1;
    }

    return edges.length - edgesKept;
    
}


private int getComponentsCount(DSu dsu, int n) {
    int components = 0;
    for (int i = 1; i <= n; i++) {
        if (dsu.parent[i] == i) {
            components++;
        }
    }

    return components;
}