public class VerySimple {
    private void run(InputReader in, PrinterWriter out) {
        int x = in.nextInt();
        int y = in.nextInt();
        int N = in.nextInt();

        int left = 0;
        int right = (int) 1e9;  
        int answer = -1;
        N--;


        while (left<=right) {
            int middle = (left+right) / 2;
            if (middle/x + middle/y >= N) {
                answer = middle;
                right = middle - 1;


            } else {
                left = middle + 1;

            } 
            System.out.println(Math.min(x, y) + answer);
            


        }

    }
    
}
