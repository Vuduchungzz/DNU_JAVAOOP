package exercises.strings;

import java.util.*;

public class StringsEx {
    // Ex1: đảo chuỗi
    public static String ex1_reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    // Ex2: đếm 'a' (ký tự thường 'a')
    public static int ex2_countA(String s) {
        int c=0; for (int i=0;i<s.length();i++) if (s.charAt(i)=='a') c++; return c;
    }

    // Ex3: palindrome?
    public static boolean ex3_isPalindrome(String s) {
        int i=0,j=s.length()-1;
        while (i<j) {
            if (s.charAt(i)!=s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }

    // Ex4: đếm số từ (cách nhau bởi 1 khoảng trắng)
    public static int ex4_countWords(String s) {
        if (s == null || s.isEmpty()) return 0;
        String[] parts = s.trim().split(" ");
        int cnt=0; for (String p: parts) if (!p.isEmpty()) cnt++;
        return cnt;
    }

    // Ex5: chuỗi có chứa ít nhất 1 ký tự số?
    public static boolean ex5_containsDigit(String s) {
        for (int i=0;i<s.length();i++) if (Character.isDigit(s.charAt(i))) return true;
        return false;
    }

    // Ex6: pangram?
    public static boolean ex6_isPangram(String s) {
        boolean[] seen = new boolean[26];
        s = s.toLowerCase(Locale.ROOT);
        int count=0;
        for (int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if (ch>='a' && ch<='z') {
                int idx = ch - 'a';
                if (!seen[idx]) { seen[idx]=true; count++; if (count==26) return true; }
            }
        }
        return count==26;
    }

    // Ex7: toUpperCase
    public static String ex7_upper(String s) { return s.toUpperCase(Locale.ROOT); }

    // Ex8: in tháp * với 1 vòng lặp
    public static String ex8_starTower(int N) {
        StringBuilder sb = new StringBuilder();
        String cur = "";
        for (int i=0;i<N;i++) {
            cur += "*";
            sb.append(cur).append("\n");
        }
        return sb.toString();
    }

    // Ex9: tần suất ký tự
    public static String ex9_charFrequency(String s) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (char ch: s.toCharArray()) map.put(ch, map.getOrDefault(ch, 0) + 1);
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character,Integer> e : map.entrySet()) {
            sb.append(e.getKey()).append(" xuất hiện ").append(e.getValue()).append(" lần\n");
        }
        return sb.toString();
    }
}
