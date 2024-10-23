
public class Pow {
    public double myPow(double x, int n) {
        long exponent = (long) n;

        if (exponent < 0) {
            exponent = - exponent;
            x = 1/exponent;
        }

        return myPow_(x, exponent);
    
        }

        private double myPow_(double x,  long exponent) {
            if (exponent == 0) return 1;

            return (exponent % 2 == 0) ? myPow_(x*x, exponent/2) : myPow_(x*x, exponent/2) * x); 

        }
    
}

// class Solution {
//     public double myPow(double x, int n) {
//         long exponent = n;  // Use long to handle edge case of n = Integer.MIN_VALUE
//         if (exponent < 0) {
//             x = 1 / x;
//             exponent = -exponent;
//         }
//         return myPow_(x, exponent);
//     }

//     private double myPow_(double x, long exponent) {
//         if (exponent == 0) return 1;
//         double half = myPow_(x, exponent / 2);
//         if (exponent % 2 == 0) {
//             return half * half;
//         } else {
//             return half * half * x;
//         }
//     }
// }