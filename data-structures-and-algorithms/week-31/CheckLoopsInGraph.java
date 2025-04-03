import java.io.PrintWriter;
import java.util.Scanner;

public class CheckLoopsInGraph {
    Scanner in = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
    int n =  in.nextInt();
    int[][] adjacencyMatrix = new int[n][n];

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            adjacencyMatrix[i][j] = in.nextInt();
        }
        
    }

    boolean hasLoops = false;
    for (int i = 0; i < n; i++) {
        if (adjacencyMatrix[i][i] == 1) {
            hasLoops = true;
            break;
        }
    }

    if (hasLoops) {
        out.println("YES");
    } else {
        out.println("NO");
    }

    out.flush();
    out.close();
    in.close();
}


