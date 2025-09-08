package exercises.oop.inheritance.userapp;

import java.util.*;

public class UserApp {
    private static final Scanner sc = new Scanner(System.in);
    private static final ArrayList<User> users = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm 1 Customer");
            System.out.println("2. Thêm 1 Admin");
            System.out.println("3. In ra tất cả User");
            System.out.println("4. Sắp xếp: Admin ở trên, Customer ở dưới");
            System.out.println("5. Đăng nhập");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            String choice = sc.nextLine();
            switch (choice) {
                case "1": addCustomer(); break;
                case "2": addAdmin(); break;
                case "3": printUsers(); break;
                case "4": sortUsers(); break;
                case "5": login(); break;
                case "0": return;
                default: System.out.println("Không hợp lệ!");
            }
        }
    }

    private static void addCustomer(){
        Customer c = new Customer();
        c.input();
        users.add(c);
        System.out.println("Đã thêm Customer.");
    }

    private static void addAdmin(){
        Admin a = new Admin();
        a.input();
        users.add(a);
        System.out.println("Đã thêm Admin.");
    }

    private static void printUsers(){
        if (users.isEmpty()) System.out.println("Danh sách rỗng.");
        else for (User u: users) System.out.println(u);
    }

    private static void sortUsers(){
        users.sort((u1,u2)-> {
            // Admin đứng trước Customer
            boolean a1 = u1 instanceof Admin;
            boolean a2 = u2 instanceof Admin;
            if (a1 && !a2) return -1;
            if (!a1 && a2) return 1;
            return 0;
        });
        System.out.println("Đã sắp xếp.");
    }

    private static void login(){
        System.out.print("Username: ");
        String username = sc.nextLine();
        System.out.print("Password: ");
        String password = sc.nextLine();

        for (User u: users){
            if (u.getUsername()!=null && u.getUsername().equals(username) &&
                u.getPassword()!=null && u.getPassword().equals(password)){
                System.out.println("Đăng nhập thành công: " + u);
                return;
            }
        }
        System.out.println("Sai thông tin đăng nhập.");
    }
}
