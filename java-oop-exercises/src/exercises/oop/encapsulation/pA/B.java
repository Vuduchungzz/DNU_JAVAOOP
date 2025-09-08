package exercises.oop.encapsulation.pA;

// Class B cùng package pA
public class B {
    public void increaseA(A obj){
        // có thể gọi inc() vì cùng package
        obj.inc();
    }

    public int squareA(A obj){
        // có thể gọi sqr() vì cùng package
        return obj.sqr();
    }
}
