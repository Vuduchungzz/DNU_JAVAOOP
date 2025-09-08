package exercises.arrays;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        System.out.println("Ex1: " + ArraysEx.ex1_print5(new int[]{4,1,2,7,9}));
        System.out.println("Ex2: " + ArraysEx.ex2_printN(new int[]{1,2,3,4}));
        System.out.println("Ex3: " + ArraysEx.ex3_printReverse(new int[]{4,1,2,7}));
        System.out.println("Ex4 sum: " + ArraysEx.ex4_sum(new int[]{1,2,3}));
        System.out.println("Ex5 sum even at odd index: " + ArraysEx.ex5_sumEvenValueAtOddIndex(new int[]{4,2,6,8,10}));
        System.out.println("Ex6 first,last: " + Arrays.toString(ArraysEx.ex6_firstLast(new int[]{9,8,7})));
        System.out.println("Ex7 max,min: " + Arrays.toString(ArraysEx.ex7_maxMin(new int[]{4,1,2,4,4})));
        System.out.println("Ex8 max & count: " + Arrays.toString(ArraysEx.ex8_maxAndCount(new int[]{4,1,2,4,4})));
        System.out.println("Ex9 count even: " + ArraysEx.ex9_countEven(new int[]{1,2,3,4,6}));
        System.out.println("Ex10 divisible by 5: " + ArraysEx.ex10_divisibleBy5(new int[]{1,2,3,4}));
        System.out.println("Ex11 index of last max: " + ArraysEx.ex11_indexOfLastMax(new int[]{1,9,3,9,5}));
        System.out.println("Ex12 remove at 2: " + Arrays.toString(ArraysEx.ex12_removeAt(new int[]{1,2,3,4}, 2)));
        System.out.println("Ex13 non-decreasing? " + ArraysEx.ex13_nonDecreasing(new int[]{1,2,2,4}));
    }
}
