package exercises.oop.encapsulation;

import exercises.oop.encapsulation.pA.*;
import exercises.oop.encapsulation.pB.C;

public class EncapsulationDemo {
    public static void main(String[] args) {
        A objA = new A();
        objA.setA(5);
        System.out.println("getA = " + objA.getA());

        B objB = new B();
        objB.increaseA(objA);
        System.out.println("after inc, a = " + objA.getA());
        System.out.println("square via B (same package): " + objB.squareA(objA));

        C objC = new C();
        objC.setA(7);
        System.out.println("square via subclass C: " + objC.squareViaSubclass());
    }
}
