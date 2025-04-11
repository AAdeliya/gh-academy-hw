import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Set;

import AdjacencyMatrixToListDirected7.Pair;

public class CheckParallelEdgesDirected {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int m = in.nextInt();

        Set<Pair> edges = new HashSet<>();
        boolean hasParallelEdges = false;
        for (int i = 0; i < m; i++) {
            int u = in.nextInt();
            int v = in.nextInt();
            Pair currentEdge = new Pair(u,v);
            if (edges.contains(currentEdge)) {
                hasParallelEdges = true;
                break;
            } else {
                edges.add(currentEdge);
            }
            
        }

        if (hasParallelEdges) {
            out.print("YES");
        } else {
            out.print("NO");
        }
    }

        static class Pair {
            int u, v;
            public Pair(int u, int v) {
                u = this.u;
                v = this.v;
            }

            @Override
            public boolean equals(Object obj) {
                if (this == obj) return true;
                if (obj == null || getClass() != obj.getClass()) return false;
                Pair pair = (Pair) obj;
                return u == pair.u && v == pair.v;
            }

            @Override
            public int hashCode() {
                return 31 * u + v;
            }

        }
    }
    

