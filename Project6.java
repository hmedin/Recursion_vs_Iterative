package project6;

public class Project6 {

    public static void main(String[] args) {
        int tens = 10;

        System.out.printf("%-10s%-15s%-15s%-10s\n", "x", "fib(x)", "Recursive(ns)", "Iterative(ns)");
        System.out.println("======================================================");

        while (tens <= 50) {

            long start = System.nanoTime();
            Fibonacci.recursiveFib(tens);
            long elapsedRecursive = System.nanoTime() - start;

            start = System.nanoTime();
            Fibonacci.iterativeFib(tens);
            long elapsedIterative = System.nanoTime() - start;

            System.out.printf("%-10d%-15d%-15d%-10d\n", tens, Fibonacci.iterativeFib(tens), elapsedRecursive, elapsedIterative);
            tens += 10;
        }

        System.out.println("======================================================");

    }

}
