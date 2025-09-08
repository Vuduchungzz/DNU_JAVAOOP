package exercises.strings;

public class StringsDemo {
    public static void main(String[] args) {
        System.out.println("Reverse Hello: " + StringsEx.ex1_reverse("Hello"));
        System.out.println("count 'a' in banana: " + StringsEx.ex2_countA("banana"));
        System.out.println("racecar palindrome? " + StringsEx.ex3_isPalindrome("racecar"));
        System.out.println("count words: " + StringsEx.ex4_countWords("one two three"));
        System.out.println("contains digit? " + StringsEx.ex5_containsDigit("abc123"));
        System.out.println("pangram? " + StringsEx.ex6_isPangram("The quick brown fox jumps over the lazy dog"));
        System.out.println(StringsEx.ex7_upper("Xin chào"));
        System.out.println(StringsEx.ex8_starTower(5));
        System.out.println(StringsEx.ex9_charFrequency("Hello"));
    }
}
