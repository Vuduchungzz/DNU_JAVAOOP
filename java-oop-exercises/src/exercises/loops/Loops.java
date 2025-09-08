package exercises.loops;

import java.math.BigInteger;

public class Loops {
    // Ex1: In 20 lần "PTIT" (return as String with newlines)
    public static String ex1_print20() {
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<20;i++) sb.append("PTIT\n");
        return sb.toString();
    }

    // Ex2: 1..N
    public static String ex2_1ToN(int N) {
        StringBuilder sb = new StringBuilder();
        for (int i=1;i<=N;i++) sb.append(i).append("\n");
        return sb.toString();
    }

    // Ex3: N..1
    public static String ex3_NTo1(int N) {
        StringBuilder sb = new StringBuilder();
        for (int i=N;i>=1;i--) sb.append(i).append("\n");
        return sb.toString();
    }

    // Ex4: sum 1..N
    public static long ex4_sum1ToN(int N) {
        long s=0;
        for (int i=1;i<=N;i++) s+=i;
        return s;
    }

    // Ex5: các số chẵn <= N (1 dòng cách)
    public static String ex5_evenUpToN(int N) {
        StringBuilder sb = new StringBuilder();
        for (int i=2;i<=N;i+=2) {
            if (sb.length()>0) sb.append(" ");
            sb.append(i);
        }
        return sb.toString();
    }

    // Ex6: tìm N nhỏ nhất sao cho 1+..+N <= S
    public static int ex6_minNForSumLE(long S) {
        long sum=0; int n=0;
        while (sum + (n+1) <= S) {
            n++; sum += n;
        }
        return n;
    }

    // Ex7: yêu cầu nhập lại đến khi N>0 -> logic core: validate
    public static boolean ex7_isPositive(int N) {
        return N > 0;
    }

    // Ex8: N là lũy thừa của 2?
    public static boolean ex8_isPowerOfTwo(int N) {
        if (N <= 0) return false;
        return (N & (N - 1)) == 0;
    }

    // Ex9: N! (BigInteger)
    public static BigInteger ex9_factorial(int N) {
        if (N < 0) throw new IllegalArgumentException("N must be >= 0");
        BigInteger f = BigInteger.ONE;
        for (int i=2;i<=N;i++) f = f.multiply(BigInteger.valueOf(i));
        return f;
    }

    // Ex10: bảng cửu chương N (1..10)
    public static String ex10_multiplicationTable(int N) {
        StringBuilder sb = new StringBuilder();
        for (int i=1;i<=10;i++) {
            sb.append(N).append(" x ").append(i).append(" = ").append(N*i).append("\n");
        }
        return sb.toString();
    }

    // Ex11: ước số của N
    public static String ex11_divisors(int N) {
        StringBuilder sb = new StringBuilder();
        for (int i=1;i<=N;i++) if (N % i == 0) {
            if (sb.length()>0) sb.append(" ");
            sb.append(i);
        }
        return sb.toString();
    }

    // Ex12: số nguyên tố?
    public static boolean ex12_isPrime(int N) {
        if (N <= 1) return false;
        if (N <= 3) return true;
        if (N % 2 == 0 || N % 3 == 0) return false;
        for (int i=5;i*i<=N;i+=6)
            if (N % i == 0 || N % (i+2) == 0) return false;
        return true;
    }

    // Ex13: tổng chữ số của N
    public static int ex13_sumDigits(int N) {
        N = Math.abs(N);
        int s=0;
        while (N>0) { s += N%10; N/=10; }
        return s;
    }

    // Ex14: in từng ký tự (1 dòng) -> trả String nhiều dòng
    public static String ex14_charsPerLine(String name) {
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<name.length();i++) {
            sb.append(name.charAt(i)).append("\n");
        }
        return sb.toString();
    }

    // Ex15: 1*2 + 2*3 + ... + N*(N+1)
    public static long ex15_series(int N) {
        long s=0;
        for (int i=1;i<=N;i++) s += 1L * i * (i+1);
        return s;
    }
}
