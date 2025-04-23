package data-structures-and-algorithms.week-32;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class BanquetSeating {
    static int n;
    static int m;
    static List<List<Integer>> adjList;
    static int[] color;
    static boolean isBapartite;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        n = in.nextInt();
        m = in.nextInt();
        adjList = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int u = in.nextInt();
            int v = in.nextInt();
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        color = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            color[i] = -1;
        }

        isBapartite = true;
        for (int i = 1; i <= n ; i++) {
            if (color[i] == -1) {
                if (!isBapartite(i,0)) {
                    isBapartite = false;
                    break;
                }
            }
        }

        if (isBapartite) {
            out.println("YES");
            for (int i = 1; i <= n; i++) {
                if (color[i] == 0) {
                    out.print(i);
                }
            }
        } else {
            out.print("NO");
        }

        out.flush();

    }

    static boolean isBapartiteDFS(int vertex, int c) {
        color[vertex]  = c;
        for (int neighbor : adjList.get(vertex)) {
            if (color[neighbor] == -1) {
                if (!isBapartiteDFS(neighbor, 1 - c)) {
                    return false;
                }
            } else if (color[neighbor] == c) {
                return false;
            }
        }

        return true;
    }
    
}
