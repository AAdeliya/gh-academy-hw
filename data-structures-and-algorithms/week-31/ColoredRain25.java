import java.io.PrintWriter;
import java.util.Scanner;

public class ColoredRain25 {
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

        in.nextLine();
        in.nextLine();

        int[] hillColors = new int[n];
        for (int i = 0; i < n ; i++) {
            hillColors[i] = in.nextInt();
        }

        int badBridgeCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n ; j++) {
                if (adjacencyMatrix[i][j] == 1) {
                    int colorHill1 = hillColors[i];
                    int colorHill2 = hillColors[j];
                    if (colorHill1 != colorHill2) {
                        badBridgeCount++;
                    }
                }
            }
        }

        out.println(badBridgeCount);
        out.flush();
    }
    
}
