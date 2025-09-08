package exercises.oop.methods;

import java.util.*;

public class OOPMethodsDemo {
    public static void main(String[] args) {
        RectangleEx r = new RectangleEx(5,5);
        System.out.println(r + ", area=" + r.getArea() + ", peri=" + r.getPerimeter() + ", isSquare=" + r.isSquare());

        CircleEx c = new CircleEx(3);
        System.out.println(c + ", area=" + c.getArea() + ", peri=" + c.getPerimeter());

        TriangleEx t = new TriangleEx(3,4,5);
        System.out.println(t + ", area=" + t.getArea() + ", right? " + t.isRightTriangle());

        SquareEx s = new SquareEx(10);
        System.out.println(s + ", area=" + s.getArea() + ", integer side? " + s.isIntegerSquareSide());

        AnimalEx a1 = new AnimalEx("Dog", "Brown", 3);
        AnimalEx a2 = new AnimalEx("Cat", "Brown", 2);
        System.out.println(a1 + ", yob=" + a1.getYearOfBirth() + ", same color a2? " + a1.equalsColor(a2));

        ProductEx p = new ProductEx("Pen", 2.5, 10);
        System.out.println(p + ", total=" + p.getTotalPrice());

        PlayerEx p1 = new PlayerEx("P1", 18, 99, 0, 0);
        PlayerEx p2 = new PlayerEx("P2", 18, 101, 1, 1);
        GameEx g = new GameEx(1, p1, p2);
        System.out.println("Winner: " + g.getWinner());

        List<Book> books = new ArrayList<>();
        books.add(new Book("Java OOP", 10, 5));
        books.add(new Book("DSA", 12, 3));
        books.add(new Book("Java OOP", 12, 7));

        System.out.println("All books:");
        BooksOps.printBooks(books);

        System.out.println("Max price books:");
        for (Book b: BooksOps.maxPriceBooks(books)) System.out.println(b);

        System.out.println("Books named Java OOP:");
        for (Book b: BooksOps.booksNamedJavaOOP(books)) System.out.println(b);

        BooksOps.sortByQuantityAsc(books);
        System.out.println("Sort quantity asc:");
        BooksOps.printBooks(books);

        BooksOps.sortByPriceDesc(books);
        System.out.println("Sort price desc:");
        BooksOps.printBooks(books);
    }
}
