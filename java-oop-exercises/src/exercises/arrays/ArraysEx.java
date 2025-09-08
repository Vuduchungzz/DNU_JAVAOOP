package exercises.arrays;

import java.util.*;

public class ArraysEx {
    // Ex1: In mảng 5 số -> trả chuỗi
    public static String ex1_print5(int[] a) {
        if (a.length != 5) throw new IllegalArgumentException("Mảng phải có 5 phần tử");
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<a.length;i++) {
            if (i>0) sb.append(" ");
            sb.append(a[i]);
        }
        return sb.toString();
    }

    // Ex2: In N phần tử (1 dòng)
    public static String ex2_printN(int[] a) {
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<a.length;i++) {
            if (i>0) sb.append(" ");
            sb.append(a[i]);
        }
        return sb.toString();
    }

    // Ex3: In N phần tử theo thứ tự ngược
    public static String ex3_printReverse(int[] a) {
        StringBuilder sb = new StringBuilder();
        for (int i=a.length-1;i>=0;i--) {
            if (sb.length()>0) sb.append(" ");
            sb.append(a[i]);
        }
        return sb.toString();
    }

    // Ex4: Tổng mảng
    public static long ex4_sum(int[] a) {
        long s=0; for (int x: a) s+=x; return s;
    }

    // Ex5: Tổng các phần tử chẵn ở chỉ số lẻ
    public static long ex5_sumEvenValueAtOddIndex(int[] a) {
        long s=0;
        for (int i=1;i<a.length;i+=2) if (a[i] % 2 == 0) s+=a[i];
        return s;
    }

    // Ex6: phần tử đầu & cuối
    public static int[] ex6_firstLast(int[] a) {
        return new int[]{a[0], a[a.length-1]};
    }

    // Ex7: max & min
    public static int[] ex7_maxMin(int[] a) {
        int mn=a[0], mx=a[0];
        for (int x: a) { if (x<mn) mn=x; if (x>mx) mx=x; }
        return new int[]{mx, mn};
    }

    // Ex8: max & count
    public static int[] ex8_maxAndCount(int[] a) {
        int mx = a[0], cnt=0;
        for (int x: a) if (x>mx) mx=x;
        for (int x: a) if (x==mx) cnt++;
        return new int[]{mx, cnt};
    }

    // Ex9: đếm số chẵn
    public static int ex9_countEven(int[] a) {
        int c=0; for (int x: a) if (x%2==0) c++; return c;
    }

    // Ex10: in số chia hết cho 5, nếu không có -> thông báo (trả chuỗi)
    public static String ex10_divisibleBy5(int[] a) {
        StringBuilder sb = new StringBuilder();
        for (int x: a) if (x%5==0) {
            if (sb.length()>0) sb.append(" ");
            sb.append(x);
        }
        if (sb.length()==0) return "Không tồn tại phần tử nào chia hết cho 5";
        return sb.toString();
    }

    // Ex11: chỉ số phần tử lớn nhất cuối cùng
    public static int ex11_indexOfLastMax(int[] a) {
        int mx=a[0], idx=0;
        for (int i=0;i<a.length;i++) {
            if (a[i] >= mx) { mx=a[i]; idx=i; }
        }
        return idx;
    }

    // Ex12: xóa phần tử tại k (0<=k<N)
    public static int[] ex12_removeAt(int[] a, int k) {
        if (k<0 || k>=a.length) throw new IllegalArgumentException("k không hợp lệ");
        int[] b = new int[a.length-1];
        int j=0;
        for (int i=0;i<a.length;i++) if (i!=k) b[j++]=a[i];
        return b;
    }

    // Ex13: mảng không giảm?
    public static boolean ex13_nonDecreasing(int[] a) {
        for (int i=1;i<a.length;i++) if (a[i] < a[i-1]) return false;
        return true;
    }
}
