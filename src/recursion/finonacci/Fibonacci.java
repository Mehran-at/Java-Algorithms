package recursion.finonacci;

public class Fibonacci {

    public static void main(String[] args) {

        Fibonacci fibonacci = new Fibonacci();
        fibonacci.getFibonacciSequence(0);

    }

    private void getFibonacciSequence(int idx) {

        while (idx < 10) {
            System.out.println(getFibonacciNum(idx)); // 0 1 1 2 4 5 8 ...
            idx++; // 0 1 2 3 4 5 ...
        }
    }

    private long getFibonacciNum(int i) {

        if (i == 0) {
            return 0;
        }
        if (i <= 2) {
            return 1;
        }

        long fiboNum = getFibonacciNum(i - 1) + getFibonacciNum(i - 2); // 5 + 3

        return fiboNum;
    }

}
/*
    Recursion = A way of solving a problem by having a function call itself.

    the Fibonacci numbers, commonly denoted Fₙ, form a sequence, called the Fibonacci sequence, such that each number is
    the sum of the two preceding ones, starting from 0 and 1. That is, and for n > 1.
 */