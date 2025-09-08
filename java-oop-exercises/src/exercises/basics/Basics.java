package exercises.basics;

import java.util.*;

public class Basics {
    // Ví dụ 1: Tổng, hiệu, tích, thương 2 số nguyên
    public static double[] ex1(int a, int b) {
        double thuong = b == 0 ? Double.NaN : (double)a / b;
        return new double[]{a + b, a - b, a *  b, thuong};
    }

    // Ví dụ 2: Chu vi & diện tích hình tròn
    public static double[] ex2(double r) {
        double cv = 2 * Math.PI * r;
        double dt = Math.PI * r * r;
        return new double[]{cv, dt};
    }

    // Ví dụ 3: Chu vi & diện tích HCN
    public static double[] ex3(double w, double h) {
        double cv = 2 * (w + h);
        double dt = w * h;
        return new double[]{cv, dt};
    }

    // Ví dụ 4: Chu vi & diện tích tam giác (Heron) từ 3 cạnh
    public static double[] ex4(double a, double b, double c) {
        double p = a + b + c;
        double s = p / 2.0;
        double area = Math.sqrt(Math.max(0, s * (s - a) * (s - b) * (s - c)));
        return new double[]{p, area};
    }

    // Ví dụ 5: Từ tuổi (năm 2023) suy ra năm sinh
    public static int ex5(int age2023) {
        return 2023 - age2023;
    }

    // Ví dụ 6: Chữ số cuối cùng của N
    public static int ex6(int n) {
        return Math.abs(n) % 10;
    }

    // Ví dụ 7: Chữ số gần cuối của N (ít nhất 2 chữ số)
    public static int ex7(int n) {
        n = Math.abs(n);
        return (n / 10) % 10;
    }

    // Ví dụ 8: Độ dài tên
    public static int ex8(String name) {
        return name.length();
    }

    // Ví dụ 9: In a / b một lần in
    public static String ex9(int a, int b) {
        double res = (double)a / b;
        return a + " / " + b + " = " + res;
    }

    // Ví dụ 10: Ký tự kế tiếp
    public static char ex10(char ch) {
        return (char)(ch + 1);
    }

    // Ví dụ 11: Hoán đổi dùng biến phụ
    public static int[] ex11_swapWithTemp(int a, int b) {
        int c = a; a = b; b = c;
        return new int[]{a, b};
    }

    // Ví dụ 12: Hoán đổi không dùng biến phụ
    public static int[] ex12_swapNoTemp(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        return new int[]{a, b};
    }
}
