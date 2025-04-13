import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class CheckSemiCompleteGraph19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int m = in.nextInt();
        List<Set<Integer>> adjSet = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adjSet.add(new HashSet<>());
        }

        for (int i = 0; i < m; i++) {
            int u = in.nextInt();
            int v = in.nextInt();
            adjSet.get(u).add(v);
        }

        boolean isSemiComplete = true;
        for (int u = 1; u <= n; u++) {
            for (int v = 1; v <= n; v++) {
                if (u == v) continue;

                boolean edgeExist = adjSet.get(u).contains(v) || adjSet.get(v).contains(u);
                if (!edgeExist) {
                    isSemiComplete = false;
                    break;
                }
            }

            if (!isSemiComplete) {
                break;
            }
        }

        if (isSemiComplete) {
            out.print("YES");
        } else {
            out.print("NO");
        }

        out.flush();
        
    }
    
}
