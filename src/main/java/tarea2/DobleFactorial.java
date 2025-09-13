package tarea2;

public class DobleFactorial {
    public static long factorialDoble(long n) {
        if (n <= 1) {
            return 1;
        }
        return factorialDoble(n - 1) + (n - 1) * factorialDoble(n - 1);
    }
}
