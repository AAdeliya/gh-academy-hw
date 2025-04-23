package data-structures-and-algorithms.week-32;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class BanquetSeating {
    static int n; //numbers of VIPS
    static int m; //number of pairs who cannot sit together
    static List<List<Integer>> adList; // adj list representing conflicts 
    static int[] color; //array to store color assigment for each VIP (0 or 1), -1 means uncollored
    static boolean isBipartite; //flag to indicate if the graph is bipartite

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        n = in.nextInt();
        m = in.nextInt();

        adList = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adList.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int u = in.nextInt();
            int v = in.nextInt();

            adList.get(u).add(v);
            adList.get(v).add(u);
        }

        color = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            color[i] = - 1;///mark all uncolored initially 
        }

        isBipartite = true;

        //check if the graph is bipartitie
        for (int i = 1; i <= n ; i++) {
            if (color[i] == - 1) { //if vertex is not colored yet. start coloring from here
                if (!isBipartiteDFS(i, 0)) { //try to color with color 0
                    isBipartite = false;
                    break;

                } 

            }

            
        }

        //output resulut
        if (isBipartite) {
            out.println("YES");

            //output the VIPs assigned to the first table (table 0)
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

    static boolean isBipartiteDFS(int vertex, int c) {
        color[vertex] = c; //assign color 'c' to the current vertex

        //explore neighbords of the current vertex
        for (int neighbor : adList.get(vertex)) {
            if (color[vertex] == 1) {
                if (!isBipartiteDFS(neighbor, 1 - c)) { //recursively color neigbbor with the opposite color ( 1 - c)
                    return false; //if coloring the neighbor with opposite color leads to conflict, return false;

                    
                }


            } else if (color[neighbor] == c)  {
                //if neighbor is already colored and has the same color as current vertex
                return false;// conflict : adjacent vertecis have the same color, not bipartite
        }
    }

    return true;
    }
    
}
