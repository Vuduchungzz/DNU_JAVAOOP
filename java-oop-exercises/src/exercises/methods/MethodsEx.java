package exercises.methods;

import java.math.BigInteger;

public class MethodsEx {
    // Ex1: tổng 2 số
    public static int sum2(int a, int b) { return a + b; }

    // Ex2: tích 3 số
    public static int mul3(int a, int b, int c) { return a*b*c; }

    // Ex3: số tự nhiên?
    public static boolean isNatural(int n) { return n >= 0; }

    // Ex4: chẵn?
    public static boolean isEven(int n) { return n % 2 == 0; }

    // Ex5: N!
    public static BigInteger fact(int n) {
        if (n<0) throw new IllegalArgumentException("n>=0");
        BigInteger f = BigInteger.ONE;
        for (int i=2;i<=n;i++) f=f.multiply(BigInteger.valueOf(i));
        return f;
    }

    // Ex6: số ước của N
    public static int countDivisors(int n) {
        if (n<=0) return 0;
        int c=0;
        for (int i=1;i*i<=n;i++) {
            if (n%i==0) {
                c += (i*i==n) ? 1 : 2;
            }
        }
        return c;
    }

    // Ex7: Hello + tên
    public static String hello(String name) { return "Hello " + name; }

    // Ex8: chuỗi đối xứng?
    public static boolean isPalindrome(String s) {
        int i=0, j=s.length()-1;
        while (i<j) { if (s.charAt(i)!=s.charAt(j)) return false; i++; j--; }
        return true;
    }

    // Ex9: ƯCLN
    public static int gcd(int a, int b) {
        a = Math.abs(a); b = Math.abs(b);
        if (a==0) return b; if (b==0) return a;
        while (b!=0) { int t=a%b; a=b; b=t; }
        return a;
    }

    // Ex10: pangram?
    public static boolean isPangram(String s) {
        boolean[] seen=new boolean[26]; int cnt=0;
        s = s.toLowerCase();
        for (int i=0;i<s.length();i++) {
            char ch=s.charAt(i);
            if (ch>='a' && ch<='z') {
                int idx=ch-'a';
                if (!seen[idx]) { seen[idx]=true; cnt++; if (cnt==26) return true; }
            }
        }
        return cnt==26;
    }

    // Ex11: số nguyên tố?
    public static boolean isPrime(int n) {
        if (n<=1) return false;
        if (n<=3) return true;
        if (n%2==0 || n%3==0) return false;
        for (int i=5;i*i<=n;i+=6) if (n%i==0 || n%(i+2)==0) return false;
        return true;
    }

    // Ex12: in n lần chuỗi s (mỗi dòng)
    public static String repeatLines(String s, int n) {
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<n;i++) sb.append(s).append("\n");
        return sb.toString();
    }

    // Ex13: diện tích tam giác với 3 cạnh (Heron)
    public static double triangleArea(double a, double b, double c) {
        double p = (a+b+c)/2.0;
        return Math.sqrt(Math.max(0, p*(p-a)*(p-b)*(p-c)));
    }

    // Ex14: nhị phân (không dấu)
    public static String binary(int n) {
        if (n==0) return "0";
        StringBuilder sb=new StringBuilder();
        int x=n;
        while (x>0) { sb.append(x%2); x/=2; }
        return sb.reverse().toString();
    }

    // Ex15: tổng mảng
    public static long sumArray(int[] a) {
        long s=0; for (int x: a) s+=x; return s;
    }

    // Ex16: 1^2 + ... + n^2
    public static long sumSquares(int n) {
        long s=0; for (int i=1;i<=n;i++) s+=1L*i*i; return s;
    }

    // Ex17: chữ số cuối cùng của số nguyên
    public static int getLastDigit(int n) { return Math.abs(n)%10; }

    // Ex18: chữ số đầu tiên của số tự nhiên
    public static int getFirstDigit(int n) {
        if (n<0) n=-n;
        while (n>=10) n/=10;
        return n;
    }

    // Ex19: số chính phương?
    public static boolean isPerfectSquare(int n) {
        if (n<0) return false; int r=(int)Math.sqrt(n); return r*r==n;
    }

    // Ex20: số lượng số 0 cuối cùng của n!
    public static int trailingZerosOfFactorial(int n) {
        int cnt=0;
        for (int p=5; p<=n; p*=5) cnt += n/p;
        return cnt;
    }

    // Ex21: in mảng, đảo mảng
    public static String printArray(int[] a) {
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<a.length;i++) {
            if (i>0) sb.append(" ");
            sb.append(a[i]);
        }
        return sb.toString();
    }
    public static int[] reverseArray(int[] a) {
        int[] b = a.clone();
        for (int i=0,j=b.length-1;i<j;i++,j--) {
            int t=b[i]; b[i]=b[j]; b[j]=t;
        }
        return b;
    }
}
