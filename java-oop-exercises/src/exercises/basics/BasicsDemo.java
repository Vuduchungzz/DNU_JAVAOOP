package exercises.basics;

public class BasicsDemo {
    public static void main(String[] args) {
        double[] v1 = Basics.ex1(5, 2);
        System.out.println("Ex1: tong=" + v1[0] + ", hieu=" + v1[1] + ", tich=" + v1[2] + ", thuong=" + v1[3]);

        double[] v2 = Basics.ex2(3);
        System.out.println("Ex2: cv=" + v2[0] + ", dt=" + v2[1]);

        double[] v3 = Basics.ex3(4, 5);
        System.out.println("Ex3: cv=" + v3[0] + ", dt=" + v3[1]);

        double[] v4 = Basics.ex4(3, 4, 5);
        System.out.println("Ex4: chu vi=" + v4[0] + ", dien tich=" + v4[1]);

        System.out.println("Ex5: nam sinh=" + Basics.ex5(20));
        System.out.println("Ex6: last digit=" + Basics.ex6(-123));
        System.out.println("Ex7: near-last digit=" + Basics.ex7(928743));
        System.out.println("Ex8: len name=" + Basics.ex8("Nguyen Van A"));
        System.out.println("Ex9: " + Basics.ex9(10, 3));
        System.out.println("Ex10: next of 'y' = " + Basics.ex10('y'));

        int[] s1 = Basics.ex11_swapWithTemp(7, 5);
        System.out.println("Ex11 swap: a=" + s1[0] + ", b=" + s1[1]);

        int[] s2 = Basics.ex12_swapNoTemp(7, 5);
        System.out.println("Ex12 swap no temp: a=" + s2[0] + ", b=" + s2[1]);
    }
}
