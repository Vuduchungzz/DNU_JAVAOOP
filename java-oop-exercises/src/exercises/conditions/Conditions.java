package exercises.conditions;

public class Conditions {
    // Ex1: N có phải số tự nhiên? (>=0)
    public static boolean ex1_isNatural(int n) { return n >= 0; }

    // Ex2: HCN là hình vuông?
    public static boolean ex2_isSquare(double a, double b) { return a == b; }

    // Ex3: chẵn?
    public static boolean ex3_isEven(int n) { return n % 2 == 0; }

    // Ex4: max(a,b)
    public static int ex4_max(int a, int b) { return (a > b) ? a : b; }

    // Ex5: điểm hợp lí [0,10]
    public static boolean ex5_validScore(double s) { return s >= 0 && s <= 10; }

    // Ex6: 3 cạnh có lập tam giác?
    public static boolean ex6_isTriangle(double a, double b, double c) {
        return a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a;
    }

    // Ex7: 3 góc có là tam giác?
    public static boolean ex7_isTriangleAngles(int a, int b, int c) {
        return a > 0 && b > 0 && c > 0 && a + b + c == 180;
    }

    // Ex8: số thực có phải số nguyên?
    public static boolean ex8_isInteger(double x) { return x == (int)x; }

    // Ex9: số chính phương?
    public static boolean ex9_isPerfectSquare(int n) {
        if (n < 0) return false;
        int r = (int)Math.sqrt(n);
        return r * r == n;
    }

    // Ex10: b là ước của a và là bội của c?
    public static boolean ex10_bIsDivisorOfAAndMultipleOfC(int a, int b, int c) {
        boolean isDivisor = (a % b == 0);
        boolean isMultiple = (b % c == 0);
        return isDivisor && isMultiple;
    }

    // Ex11: ch là chữ thường?
    public static boolean ex11_isLowercase(char ch) {
        return ch >= 'a' && ch <= 'z';
    }

    // Ex12: ch là chữ hoa?
    public static boolean ex12_isUppercase(char ch) {
        return ch >= 'A' && ch <= 'Z';
    }

    // Ex13: 2 chuỗi bằng nhau?
    public static boolean ex13_equals(String a, String b) { return a.equals(b); }

    // Ex14: in chuỗi dài hơn; nếu bằng nhau -> in a (trả về chuỗi)
    public static String ex14_longer(String a, String b) {
        if (a.length() >= b.length()) return a;
        return b;
    }

    // Ex15: h,m -> sau 1 phút
    public static String ex15_nextMinute(int h, int m) {
        int mm = m + 1, hh = h;
        if (mm == 60) { mm = 0; hh = (h + 1) % 24; }
        return String.format("%02d:%02d", hh, mm);
    }
}
