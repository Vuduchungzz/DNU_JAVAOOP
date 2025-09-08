package exercises.oop.encapsulation.pB;

import exercises.oop.encapsulation.pA.A;

public class C extends A {
    // Là subclass, có thể dùng protected sqr() qua 'this'
    public int squareViaSubclass(){
        return this.sqr(); // OK vì protected
    }
}
