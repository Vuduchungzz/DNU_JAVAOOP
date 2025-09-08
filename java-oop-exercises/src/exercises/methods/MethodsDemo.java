package exercises.methods;

import java.util.Arrays;

public class MethodsDemo {
    public static void main(String[] args) {
        System.out.println("sum2(3,4)=" + MethodsEx.sum2(3,4));
        System.out.println("mul3(2,3,4)=" + MethodsEx.mul3(2,3,4));
        System.out.println("isNatural(0)? " + MethodsEx.isNatural(0));
        System.out.println("isEven(7)? " + MethodsEx.isEven(7));
        System.out.println("fact(6)=" + MethodsEx.fact(6));
        System.out.println("countDivisors(36)=" + MethodsEx.countDivisors(36));
        System.out.println(MethodsEx.hello("Khai"));
        System.out.println("isPalindrome('abba')? " + MethodsEx.isPalindrome("abba"));
        System.out.println("gcd(84,30)=" + MethodsEx.gcd(84,30));
        System.out.println("isPangram? " + MethodsEx.isPangram("The quick brown fox jumps over the lazy dog"));
        System.out.println("isPrime(97)? " + MethodsEx.isPrime(97));
        System.out.println(MethodsEx.repeatLines("Hello", 3));
        System.out.println("Triangle area 3,4,5: " + MethodsEx.triangleArea(3,4,5));
        System.out.println("binary(7)=" + MethodsEx.binary(7));
        System.out.println("sumArray=" + MethodsEx.sumArray(new int[]{1,2,3}));
        System.out.println("sumSquares(5)=" + MethodsEx.sumSquares(5));
        System.out.println("lastDigit(-123)=" + MethodsEx.getLastDigit(-123));
        System.out.println("firstDigit(12345)=" + MethodsEx.getFirstDigit(12345));
        System.out.println("perfectSquare(49)? " + MethodsEx.isPerfectSquare(49));
        System.out.println("trailing zeros 100! = " + MethodsEx.trailingZerosOfFactorial(100));
        System.out.println("print array: " + MethodsEx.printArray(new int[]{4,1,2,7}));
        System.out.println("reverse array: " + Arrays.toString(MethodsEx.reverseArray(new int[]{1,2,3,4})));
    }
}
