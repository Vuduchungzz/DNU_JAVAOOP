package exercises.oop.inheritance;

import exercises.oop.inheritance.device.*;
import exercises.oop.inheritance.animal.*;
import exercises.oop.inheritance.person.*;
import exercises.oop.inheritance.shape.*;

public class InheritanceDemo {
    public static void main(String[] args) {
        Laptop lap = new Laptop("Dell", 20000000L, "15.6\"");
        System.out.println(lap);

        Cat c1 = new Cat("Tom", 3, "Grey", "British");
        Cat c2 = new Cat("Miu", 2, "Brown", "British");
        System.out.println(c1);
        System.out.println("Cùng giống? " + c1.equalBreed(c2));
        System.out.println("Năm sinh c2: " + c2.getYearOfBirth());

        Student st = new Student("Khai", 20, "HCM", "23IT123", "PTIT");
        System.out.println(st);
        System.out.println("Đủ 18? " + st.checkAge(18));
        System.out.println("Tên in hoa: " + st.getUpperName());
        System.out.println("MSV bắt đầu 23IT? " + st.checkStudentId());

        Square sq = new Square(10);
        System.out.println(sq);
        System.out.println("Chu vi: " + (4*sq.getSide()));
        System.out.println("Diện tích: " + (sq.getSide()*sq.getSide()));
        sq.setSide(20);
        System.out.println(sq);
        System.out.println("Chu vi: " + (4*sq.getSide()));
        System.out.println("Diện tích: " + (sq.getSide()*sq.getSide()));
    }
}
