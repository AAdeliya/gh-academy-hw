public class TaskConditions {
    private InputReader in_;
    private PrinterWriter out_;

    public void put(int n) {
        if (n == 1) {
            out_.print("1 ");
            return;


        } 

        put(n-1);
        out_.print(n + "");
        remove(n-1);


    }
    private void remove(int n) {
        if (n==1) {
            out_.print("-1");
            return;

        }

        put(n-1);
        out_.print(-n+ "");
        remove(n-1);
         
    }

    
    
}
