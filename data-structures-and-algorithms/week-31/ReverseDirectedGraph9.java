import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class ReverseDirectedGraph9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt(); //numbr of vertices

        List<List<Integer>> originalAdjList = new ArrayList<>();
        for (int i = 0; i <= n; i++) { //1 based indexing
            originalAdjList.add(new ArrayList<>());

        }

        //read adjacency lists for each vertex
        for (int i = 1; i <= n; i++) {
            String line = in.nextLine(); //consume newline character
            if (i == 1) line = in.nextLine();

            Scanner lineScanner = new Scanner(line);
            while (lineScanner.hasNextInt()) {
                originalAdjList.get(i).add(lineScanner.nextInt());

            }

            lineScanner.close();
        }

        //create adjacency list for the reversed graph
        List<List<Integer>> reversedAdjList = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            reversedAdjList.add(new ArrayList<>());
        }

        //construct the reversed graph by iterating thru the original list
        for (int u = 1; u <= n; u++) {
            for (int v : originalAdjList.get(u)) {
                //if there is an edge from u to v in the orognal graph
                //add a reversed edge from v to u in the reversed graph
                reversedAdjList.get(v).add(u);
            }
        }
        //output the number of vertices

        out.println(n);

        //output the adjecency list of the reversed prapg for each vertex from 1 o n
        for (int i = 1; i <=n; i++) {
            List<Integer> neighbors = reversedAdjList.get(i);
            Collections.sort(neighbors); //ascending

            for (int j = 0; j < neighbors.size(); j++) {
                out.print(neighbors.get(j) + (j == neighbors.size() - 1 ? "" : " "));///print neighbor with space , except for the last one

            }

            out.println();
        }

        out.flush();
    }
    
}
