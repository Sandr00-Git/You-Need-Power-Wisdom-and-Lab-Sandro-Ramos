public class TriangleNumberCalculator {

    // Recursive method to find the nth triangular number
    public int value(int n) {
        if (n <= 1) {
            return n;
        } else {
            return n + value(n - 1);
        }
    }

    // Adds the nth and mth triangular numbers
    public int add(int n, int m) {
        return value(n) + value(m);
    }

    // Subtracts the mth triangular number from the nth triangular number
    public int subtract(int n, int m) {
        return value(n) - value(m);
    }
}
