package exercises.oop.constructors;

public class OOPConstructorsDemo {
    public static void main(String[] args) {
        Student st = new Student("SV001", "Khai", 20);
        System.out.println(st);
        Rectangle r = new Rectangle(4,5); System.out.println(r);
        Circle c = new Circle(3.2); System.out.println(c);
        Triangle t = new Triangle(3,4,5); System.out.println(t);
        Square s = new Square(6); System.out.println(s);
        Animal a = new Animal("Milu", "Brown", 2); System.out.println(a);
        Car car = new Car("Red", "Civic", 5, 2020); System.out.println(car);
        Product p = new Product("Book", 3.5, 10); System.out.println(p);
        Player p1 = new Player("A", 18, 0,0), p2 = new Player("B", 19, 1,1);
        Game g = new Game(1, p1, p2); System.out.println(g);
    }
}
