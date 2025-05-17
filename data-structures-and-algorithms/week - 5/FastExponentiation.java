package data-structures-and-algorithms.week - 5;

public class FastExponentiation {
    public static long fastExponentiation(int base, int exponent) {
        long result = 1;
        long currentBase = base;

        while ( exponent > 0) {
            if (exponent % 2 == 1) {
                result *= currentBase;
            }

            currentBase *= currentBase;
            exponent /= 2;
        }

        return result;
    }

    public static void main(String[] args) {
        int base = 2;
        int exponent = 10;
        long result = fastExponentiation(base, exponent);
        System.out.println(base + "^" + " =" + result);
    }
    
}
