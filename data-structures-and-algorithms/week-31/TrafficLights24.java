import java.io.PrintWriter;
import java.util.Scanner;

public class TrafficLights24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] trafficLightCounts = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            trafficLightCounts[i] = 0;
        }

        for (int i = 0; i < m; i++) {
            int u =  in.nextInt();
            int v = in.nextInt();
            trafficLightCounts[u]++;
            trafficLightCounts[v]++;
        }

        for (int i = 1; i <= n; i++) {
            out.print(trafficLightCounts[i] + (i == n ? "" : ""));
        }

        out.println();
        out.flush();
    }
    
}
