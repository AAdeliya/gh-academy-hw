import com.sun.tools.javac.util.Pair;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CheckTransitiveUndirectedGrap21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int m = in.nextInt();
        Set<AdjacencyMatrixToListUndirected5.Pair> edges = new HashSet<>();

        for (int i = 0; i < m; i++) {
            int u = in.nextInt();
            int v = in.nextInt();

            edges.add(new Pair(u,v));
        }

        boolean isTransitive = true;
        for (int u = 1; u <= n; u++) {
            for (int v = 1; v <= n; v++) {
                if (u == v) continue;
                for (int w = 1; w <= n; w++) {
                    if (v == w || u == w) continue;

                    boolean uvEdge = edges.contains(new Pair(u,w));
                    boolean vwEdge = edges.contains(new Pair(v,w));

                    if (uvEdge && vwEdge) {
                        if (!edges.contains(new Pair(u, w))) {
                            isTransitive = false;
                            break;
                        }
                    }
                }

                if (!isTransitive) {
                    break;
                }
            }

            if (!isTransitive) {
                break;
            }
        }

        if (isTransitive) {
            out.print("YES");
        } else {
            out.print("NO");
        }

        out.flush();
    }

    static class Pair {
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
            return (u == pair.u && v == pair.v) || (u == pair.v && v == pair.u);

        }

        @Override
        public int hashCode() {
            int smaller = Math.min(u,v);
            int larger = Math.max(u,v);
            return 31 * smaller + larger;


        }

    }
    
}
