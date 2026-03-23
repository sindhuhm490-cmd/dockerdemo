public class Fibbonacci {
    public static void main(String[] args) {
        int n = 10;
        long first = 0, second = 1;
        System.out.println("Fibonacci Series (First " + n + " terms):");
        for (int i = 1; i <= n; ++i) {
            System.out.print(first + (i < n ? ", " : ""));
            long next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
}