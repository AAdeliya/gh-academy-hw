package data-structures-and-algorithms.week-32;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ConnectedComponentsCountAndList {
    static int n; //number of vertices
    static List<List<Integer>> adjacencylist;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        n = in.nextInt();
        int m = in.nextInt();
        adjacencylist = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adjacencylist.add(new ArrayList<>());
        }

        //read m lines, each representing an edge (u,v) in the undirected graph
        for (int i = 0; i < m; i++) {
            int u = in.nextInt();
            int v = in.nextInt();
            adjacencylist.get(u).add(v);
            adjacencylist.get(v).add(u);
        }

        visited = new boolean[n + 1];
        List<List<Integer>> components = new ArrayList<>();
        //iterate thru all vertices to find connected components
        for (int  i = 1; i <= n; i++) {
            if (!visited[i]) {
                List<Integer> currentComponent = new ArrayList<>();
                dfs(i, currentComponent);
                components.add(currentComponent);
            }
        }

        out.println(components.size());

        for (List<Integer> component : components) {
            out.println(component.size());
            Collections.sort(component);
            for (int i = 0; i < component.size(); i++) {
                out.print(component.get(i) + (i == component.size() - 1 ? "" : " "));

            }

            out.println();
        }

        out.flush();
            }

            static void dfs(int vertex, List<Integer> currentComponent) {
                visited[vertex] = true;
                currentComponent.add(vertex);

                for (int neighbor : adjacencylist.get(vertex)) {
                    if (!visited[neighbor]) {
                        dfs(neighbor, currentComponent);
                    }
                }
            }

    
}
