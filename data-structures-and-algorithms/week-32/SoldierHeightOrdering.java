package data-structures-and-algorithms.week-32;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class SoldierHeightOrdering {
    static int n ; //number of soldiers
    static int m; // number of  height comparison pairs
    static List<List<Integer>> adjList;
    static boolean[] visited;
    static Stack<Integer> stack; //stack to store soldiers in topological order
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        

        n = in.nextInt();
        m = in.nextInt();

        adjList = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adjList.add(new ArrayList<>());
        }

        //use a set to keep track of processed comparison pairs to handle duplicates
        Set<String> processedComparison = new HashSet<>();

        for (int i = 0; i < m; i++) {
            int tallerSoldier = in.nextInt();
            int shorterSoldier = in.nextInt();
            String comparison = shorterSoldier + "-" + tallerSoldier; //create a unique string for comparison
            //process comparison only if it's not already processed (to handle duplicates)

            if (!processedComparison.contains(comparison)) {
                processedComparison.add(comparison); // mark this compariosn as processed
                //add a directed edge from tallerSoldier to shorterSoldier in adjacency list
                //this reperesents the constraint (tallest to shoertest)
                adjList.get(tallerSoldier).add(shorterSoldier);
            }
        }

        visited = new boolean[n + 1]; //initialize visited array for soldiers 1 to n
        //perform topological sort using DFS
        for (int i = 1; i <= n; i++) { //if soldier is not yet visited, start DFS from here
            if (!visited[i]) {
                dfs(i);

            } 
        }

        //check for cycles in the graph. If a cycle exists, topologocal sort is not possible, and no valid ordering exists
        boolean hasCycle = false;
        int[] inStack = new int[n + 1]; //0:not in stack, 1 : in stack, 2:finished processign

        //re-run DFS to detect cycles
        visited = detectCycle(1, inStack); //startc cycle detection 
        if (hasCycle) {
            out.println("No"); //if a cycle is detected, no valid ordering exists
        } else {
            out.println("Yes");

            List<Integer> topologicalOrder = new ArrayList<>();
            while (!stack.isEmpty()) {
                topologicalOrder.add(stack.pop()); //pop vertices from stack to get topological order (reverse order - now tallest to shortes) 
            }

            //output the topological order (which is a valid height ordering from tallest to shortes
            for (int  i = 0; i < n; i++) {
                out.print(topologicalOrder.get(i) + (i == n - 1 ? "" : "")); 
            }

            out.println(); //new line after outputting the ordering 
        }

        out.flush();
        
    }

    //depth - first search function for topological sorting 
    static void dfs(int vertex) {
        visited[vertex] = true; //mark current vertex as visited

        //explore neighbors of the current vertex (soldiers shorter than current soldier)

        for (int neighbor : adjList.get(vertex)) {
            if (!visited[neighbor]) {
                dfs(neighbor); //recursively call DFS on the unvisited neighbor
            }
        }

        stack.push(vertex); //after visiting all neighbors, push the current vertex onto the stack

        //DFS funstion to detect cycles in the graph. return  true if cycle is detected

        static boolean detectCycle(int vertex, int[] inStack) {
            visited[vertex] = true;
            inStack[vertex] = 1;//mark current node as in recursion stack 
            for (int neighbor : adjList.get(vertex)) {
                if (!visited[neighbor]) {
                    if (detectCycle(neighbor, inStack)) {
                        return true; //cycle detected in subtree
                    }
                } else if (inStack[neighbor] == 1) {
                    return true; //back edge found, cycle detected
                }
            }

            inStack[vertex] = 2; //remove the vertex from recursion stack. fininshed processing its subtree
            return false;
        }
    }
     
    
    
}
