package exercises.loops;

public class LoopsDemo {
    public static void main(String[] args) {
        System.out.println(Loops.ex1_print20());
        System.out.println(Loops.ex2_1ToN(5));
        System.out.println(Loops.ex3_NTo1(5));
        System.out.println("Sum1..N=" + Loops.ex4_sum1ToN(10));
        System.out.println("Even<=N: " + Loops.ex5_evenUpToN(10));
        System.out.println("min N for sum<=55 : " + Loops.ex6_minNForSumLE(55));
        System.out.println("isPositive(7)? " + Loops.ex7_isPositive(7));
        System.out.println("is power of two 16? " + Loops.ex8_isPowerOfTwo(16));
        System.out.println("5! = " + Loops.ex9_factorial(5));
        System.out.println(Loops.ex10_multiplicationTable(5));
        System.out.println("Divisors of 18: " + Loops.ex11_divisors(18));
        System.out.println("Prime 97? " + Loops.ex12_isPrime(97));
        System.out.println("Sum digits 5555: " + Loops.ex13_sumDigits(5555));
        System.out.println(Loops.ex14_charsPerLine("Khai"));
        System.out.println("Series N*(N+1)=" + Loops.ex15_series(5));
    }
}
