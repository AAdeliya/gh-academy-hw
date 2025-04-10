import com.sun.tools.javac.util.Pair;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Set;

import AdjacencyMatrixToListDirected7.Pair;

public class CheckParallelEdgesUndirected10 {
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
            Pair currentEdge = new Pair(u, v);
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

        out.flush();
        

    }

    class static Pair {
        int u, v;

        public Pair(int u, int v) {
            this.u = u;
            this.v = v;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Pair pair = (Pair) obj;
            return (u == pair.u && v == pair.v) || (u == pair.v && v== pair.u);

        }
    }

    @Override
    pubic int hashCode() {
        int smalller = Math.min(u, v);
        int larger = Math.max(u, v);
        return 31 * smaller + larger;
    }

    
}
