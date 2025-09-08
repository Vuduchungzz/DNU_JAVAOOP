package exercises.oop.methods;

import java.util.Scanner;

public class StudentInput {
    private String masv;
    private String name;
    private int age;

    public StudentInput(){}
    public StudentInput(String masv, String name, int age){
        this.masv=masv; this.name=name; this.age=age;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Mã SV: "); masv = sc.nextLine();
        System.out.print("Tên: "); name = sc.nextLine();
        System.out.print("Tuổi: "); age = sc.nextInt();
    }

    @Override public String toString(){ return "StudentInput{masv='"+masv+"', name='"+name+"', age="+age+"}"; }
}
