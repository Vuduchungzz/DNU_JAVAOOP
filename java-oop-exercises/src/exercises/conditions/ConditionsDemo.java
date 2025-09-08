package exercises.conditions;

public class ConditionsDemo {
    public static void main(String[] args) {
        System.out.println("Ex1 natural? " + Conditions.ex1_isNatural(5));
        System.out.println("Ex2 square? " + Conditions.ex2_isSquare(5,5));
        System.out.println("Ex3 even? " + Conditions.ex3_isEven(10));
        System.out.println("Ex4 max " + Conditions.ex4_max(3,9));
        System.out.println("Ex5 score valid? " + Conditions.ex5_validScore(7.5));
        System.out.println("Ex6 triangle? " + Conditions.ex6_isTriangle(3,4,5));
        System.out.println("Ex7 triangle angles? " + Conditions.ex7_isTriangleAngles(60,60,60));
        System.out.println("Ex8 is integer? " + Conditions.ex8_isInteger(3.0));
        System.out.println("Ex9 perfect square? " + Conditions.ex9_isPerfectSquare(49));
        System.out.println("Ex10 b divisor & multiple? " + Conditions.ex10_bIsDivisorOfAAndMultipleOfC(12,6,3));
        System.out.println("Ex11 lowercase? " + Conditions.ex11_isLowercase('m'));
        System.out.println("Ex12 uppercase? " + Conditions.ex12_isUppercase('M'));
        System.out.println("Ex13 equals? " + Conditions.ex13_equals("java","java"));
        System.out.println("Ex14 longer= " + Conditions.ex14_longer("ab","xyz"));
        System.out.println("Ex15 next minute= " + Conditions.ex15_nextMinute(23,59));
    }
}
