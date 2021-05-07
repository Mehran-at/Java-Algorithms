package logarithms;

public class Logarithms {

    public static void main(String[] args) {
        // log(double a)      Returns the natural logarithm of (base e) of a double value.
        System.out.println(Math.log(32));
        //log10(double a)      Returns the base 10 logarithm of a double value.
        System.out.println(Math.log10(32));
        System.out.println(Math.log(Math.E));
        System.out.println(Math.log(-5.5));// Result is NaN Not a Number
        System.out.println(Math.log(0));// Result is -Infinity
    }
}
/*
    https://www.youtube.com/watch?v=uMMILaZQhxQ&ab_channel=MathandScience

    https://www.youtube.com/watch?v=4UNkQcBrLaQ&ab_channel=Don%27tMemorise

    3 times 4 = 3 * 3 * 3 * 3 = 81

    log of 81 to the base 3 = 4  we ask 3 raised to what gives us 81? answer 3 raised to 4


    --------------------------------

    4 raised to what gives us 1? (Any Non-Zero number) times 0 is equal to 1.
 */