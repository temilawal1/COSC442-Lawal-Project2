/**
 * The Class Fibonacci to simply calculates the nth Fibonacci number given the
 * input n.
 */
public class Fibonacci {

    /**
     * Calculates and returns the nth Fibonacci number.
     *
     * @param n the index
     * @return the nth Fibonacci number
     */
    public int fibonacci(int n) {
        switch (n) {
            case 0:
                return 0;
                // the method returns 1 instead of 0 when n = 0,
                // making the sequence 1, 1, 2, 3, 5 instead of
                // 0, 1, 1, 2, 3, 5 ? or 0, 1, 2, 3, 5, 8, etc
            case 1:
                return 1;
            default:
                return (fibonacci(n - 1) + fibonacci(n - 2));
        }
    }
}
