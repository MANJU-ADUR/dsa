package recursion;

public class BasicProblems {

    /**
     * Calculates the sum of the first {@code n} natural numbers using recursion.
     * <p>Example: For n = 5, the result is 1 + 2 + 3 + 4 + 5 = 15.</p>
     *
     * @param n the number of terms to sum; must be positive
     * @return the sum of the first {@code n} natural numbers
     */
    private static int sumOfFirstNElements(int n) {

        if (n == 1) return n;

        return n + sumOfFirstNElements(n - 1);
    }

    /**
     * Calculates the sum of all elements in the given integer array using recursion.
     *
     * @param arr the array whose elements are to be summed; must not be null or empty
     * @return the sum of all elements in the array
     */
    private static int sumOfArrayElements(int[] arr) {
        return helper(arr, 0);
    }

    /**
     * Helper method for recursively summing the elements of an array starting from a given index.
     *
     * @param arr the array containing the elements
     * @param n   the current index from which to start summing
     * @return the sum of elements from index {@code n} to the end of the array
     */
    private static int helper(int[] arr, int n) {
        if (n == arr.length - 1) return arr[n];

        return arr[n] + helper(arr, n + 1);
    }

    /**
     * Calculates the factorial of a given positive integer using recursion.
     * <p>Example: factorialOfN(5) = 5 × 4 × 3 × 2 × 1 = 120</p>
     *
     * @param n the number for which the factorial is to be calculated; must be positive
     * @return the factorial of {@code n}
     */
    private static int factorialOfN(int n) {
        if (n == 1) return n;
        return n * factorialOfN(n - 1);
    }

    /**
     * Determines whether a given number {@code n} is an exact power of {@code x} using recursion.
     * <p>Example: isNPowerOfX(8, 2) returns true because 8 = 2³.</p>
     *
     * @param n the number to check; must be positive
     * @param x the base value; must be greater than 1
     * @return {@code true} if {@code n} is a power of {@code x}, otherwise {@code false}
     */
    private static boolean isNPowerOfX(int n, int x) {
        if (n == 1) return true;
        else if (n < 1 || n % x != 0) return false;

        return isNPowerOfX(n / x, x);
    }

    public static void main(String[] args) {
        // Demo calls
        System.out.println(sumOfFirstNElements(5));
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(sumOfArrayElements(arr));
        System.out.println(factorialOfN(5));
        System.out.println(isNPowerOfX(27, 3));
    }
}
