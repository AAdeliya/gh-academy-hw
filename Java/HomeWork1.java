package Java;

public class HomeWork1 {
    public boolean isPrime(int number) {
        if (number <=1){
             return false;
        }

        for (int i = 2; i<=Math.sqrt(number); i++) {
            if (number % i == 0){
                return false;
            }

         
            }
        return false;
        }
       

    }
    

    // public int Fibonacci(int n) {
    //     if (n<= 1 ) {
    //         return 1;
    //     }

    //     return fib(n-1) + fib(n-2);
    // }
