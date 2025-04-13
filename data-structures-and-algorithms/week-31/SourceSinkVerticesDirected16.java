import com.sun.tools.javac.util.List;
import java.io.PrintWriter;
import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class SourceSinkVerticesDirected16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();

        int[][] adjacencyMatrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                adjacencyMatrix[i][j] = in.nextInt();
            }
        }
        
        java.util.List<Integer> sourceVertices = new ArrayList<>();
        java.util.List<Integer> sinkVertics = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            int outDegree = 0;
            int inDegree = 0;

            for (int j = 0; j < n; j++) {
                outDegree += adjacencyMatrix[i][j];
            }

            for (int j = 0; j < n; j++) {
                inDegree += adjacencyMatrix[j][i];
            }

            if (inDegree == 0) {
                sourceVertices.add(i + 1);
            }

            if (outDegree == 0) {
                sinkVertics.add(i + 1);
            }

        }

        Collections.sort(sourceVertices);
        Collections.sort(sinkVertics);

        out.println(sourceVertices.size());
        for (int i = 0; i < sourceVertices.size(); i++) {
            out.println(sourceVertices.get(i));
        }

        out.print(sinkVertics.size());
        for (int i = 0; i < sinkVertics.size(); i++) {
            out.print(sinkVertics.get(i));
        }

        out.flush();

    }
    
}
