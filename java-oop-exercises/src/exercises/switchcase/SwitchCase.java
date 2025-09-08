package exercises.switchcase;

public class SwitchCase {
    // Ex1: đọc số 0..9 tiếng Việt (chuỗi)
    public static String ex1_readDigit(int n) {
        switch (n) {
            case 0: return "Không";
            case 1: return "Một";
            case 2: return "Hai";
            case 3: return "Ba";
            case 4: return "Bốn";
            case 5: return "Năm";
            case 6: return "Sáu";
            case 7: return "Bảy";
            case 8: return "Tám";
            case 9: return "Chín";
            default: return "Không hợp lệ";
        }
    }

    // Ex2: giới tính 0,1,2
    public static String ex2_gender(int code) {
        switch (code) {
            case 0: return "Nam";
            case 1: return "Nữ";
            case 2: return "Khác";
            default: return "Không hợp lệ";
        }
    }

    // Ex3: ký tự hướng (N,S,W,E) -> chữ Việt
    public static String ex3_direction(char ch) {
        switch (Character.toUpperCase(ch)) {
            case 'N': return "Bắc";
            case 'S': return "Nam";
            case 'W': return "Tây";
            case 'E': return "Đông";
            default: return "Không hợp lệ";
        }
    }

    // Ex4: a,b và toán tử
    public static String ex4_calc(int a, int b, char op) {
        switch (op) {
            case '+': return a + " + " + b + " = " + (a + b);
            case '-': return a + " - " + b + " = " + (a - b);
            case '*': return a + " * " + b + " = " + (a * b);
            case '/': return b == 0 ? "Lỗi chia 0" : a + " / " + b + " = " + ((double)a / b);
            case '%': return b == 0 ? "Lỗi chia 0" : a + " % " + b + " = " + (a % b);
            default: return "Toán tử không hợp lệ";
        }
    }

    // Ex5: số ngày trong tháng/năm
    public static int ex5_daysInMonth(int year, int month) {
        boolean leap = (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: return 31;
            case 4: case 6: case 9: case 11: return 30;
            case 2: return leap ? 29 : 28;
            default: return -1;
        }
    }
}
