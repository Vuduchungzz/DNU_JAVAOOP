package exercises.oop.encapsulation.pA;

public class A {
    // a là private: không truy cập trực tiếp bên ngoài lớp
    private int a;

    // inc(): package-private (không modifier) -> chỉ dùng trong cùng package
    void inc(){ a++; }

    // sqr(): protected -> dùng trong cùng package và subclass
    protected int sqr(){ return a * a; }

    // setA/getA(): public -> dùng khắp project
    public void setA(int a){ this.a = a; }
    public int getA(){ return a; }
}
