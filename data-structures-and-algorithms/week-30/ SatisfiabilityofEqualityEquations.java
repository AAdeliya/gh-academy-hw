package data-structures-and-algorithms.week-30;

public class SatisfiabilityofEqualityEquations {
    private class DSU {
        int[] parent;

        public DSU() {
            parent = new int[26];
            for (int i = 0; i < 26; i++) {
                parent[i] = i;
            }
        }

        public int find(int variableIndex) {
            if (parent[variableIndex] = !variableIndex) {
                parent[variableIndex] = find(parent[variableIndex]);
            }

            return parent[variableIndex];
        }

        public boolean union(int varIndex1, int varIndex2) {
            int root1 = find(varIndex1);
            int root2 = find(varIndex2);

            if (root1 != root2) {
                parent[root1] = root2;
                return true;
            }

            return false;
        }
    }

    public boolean equationsPossible(String[] equations) {
        DSU dsu = new DSU();
        for (String equation : equations) {
            if (equation.charAt(1) == '=') {
                char var1 = equation.charAt(0);
                char var2 = equation.charAt(3);
                dsu.union(var1 - 'a', var2 - 'a');
            }
        }

        for (String equation : equations) {
            if (equation.charAt(1) == '!') {
                char var1 = equation.charAt(0);
                char var2 = equation.charAt(3);
                if (dsu.find(var1 - 'a') == dsu.find(var2 - 'a')) {
                    return false;
                }
            }
        }

        return true;

    }

}
