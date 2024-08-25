
public class FibonacciNumber {
 
 public int  fibonacci(int n) {
    int first = 0;
    int second = 1;
    int sum = 0;

    if(n == 0 || n==1) {
        return n;

    } else {
        for (int i= 0; i <n; i++) {
         first = second;
         second = sum;
         sum = first+second;

        }
    }
    return n;
 }
    
}
