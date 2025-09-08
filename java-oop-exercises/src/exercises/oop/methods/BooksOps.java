package exercises.oop.methods;

import java.util.*;

public class BooksOps {
    // In N sách
    public static void printBooks(java.util.List<Book> list){
        for (Book b : list) System.out.println(b);
    }

    // Sách có giá cao nhất
    public static List<Book> maxPriceBooks(List<Book> list){
        double mx = -1; for (Book b: list) if (b.getPrice()>mx) mx=b.getPrice();
        List<Book> ans = new ArrayList<>();
        for (Book b: list) if (b.getPrice()==mx) ans.add(b);
        return ans;
    }

    // Sách tên "Java OOP"
    public static List<Book> booksNamedJavaOOP(List<Book> list){
        List<Book> ans = new ArrayList<>();
        for (Book b: list) if ("Java OOP".equals(b.getName())) ans.add(b);
        return ans;
    }

    // Sort tăng quantity
    public static void sortByQuantityAsc(List<Book> list){
        list.sort(Comparator.comparingInt(Book::getQuantity));
    }

    // Sort giảm price
    public static void sortByPriceDesc(List<Book> list){
        list.sort((b1,b2)-> Double.compare(b2.getPrice(), b1.getPrice()));
    }
}
