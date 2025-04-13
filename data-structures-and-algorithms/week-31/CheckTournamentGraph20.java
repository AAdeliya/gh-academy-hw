import com.sun.tools.javac.util.Pair;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CheckTournamentGraph20 {
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

        boolean isTournamet = true;

        for (int u = 1; u <= n; u++) {
            for (int v = u + 1; v <= n; v++) {
                boolean uTovEdge = edges.contains(new Pair(u,v));
                boolean vTouEdge = edges.contains(new Pair(v,u));

                if (!(uTovEdge ^ vTouEdge)) {
                    isTournamet = false;
                    break;
                }
            }

            if (!isTournamet) {
                break;
            }
        }

        if (isTournamet) {
            out.print("YES");


        } else {
            out.print("NO");
        }

        out.flush();
    }

    static class Pair {
    int v, u;

    public Pair(int u, int v) {
        this.u = u;
        this.v = v;
    }

    @Override
    public boolean equals (Object obj) {
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
