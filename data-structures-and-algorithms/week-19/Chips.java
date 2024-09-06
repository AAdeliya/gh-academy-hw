import java.io.PrintWriter;

public class Chips {
    private static class Solution{
        private InputReader in_;
        private PrintWriter out_;

        private void put(int n) {
            if (n == 1) {
                out_.print("1");
                return;

            }
            put (n - 1) {
                out_.print(n + " ");
                remove(n -1) ;

            } 

            private void remove (int n) {
                if(n == 1) {
                    out_.print(" -1");
                    return;

                }
                put (n-1);
                out_.print (-n + " ");
                remove (n-1);
            }
        }
    }
      
    
}
}
