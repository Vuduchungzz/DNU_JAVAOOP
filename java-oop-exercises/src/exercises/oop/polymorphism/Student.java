package exercises.oop.polymorphism;

import java.util.Scanner;

public class Student {
    private String studentID;
    private String name;
    private int age;

    public Student(){}
    public Student(String studentID, String name, int age){
        this.studentID=studentID; this.name=name; this.age=age;
    }

    public String getStudentID(){ return studentID; }
    public void setStudentID(String studentID){ this.studentID=studentID; }
    public String getName(){ return name; }
    public void setName(String name){ this.name=name; }
    public int getAge(){ return age; }
    public void setAge(int age){ this.age=age; }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Mã SV: "); studentID = sc.nextLine();
        System.out.print("Tên: "); name = sc.nextLine();
        System.out.print("Tuổi: "); age = Integer.parseInt(sc.nextLine());
    }

    public boolean equals(Student other){
        if (other==null) return false;
        return this.studentID != null && this.studentID.equals(other.studentID);
    }

    public void incAge(){ age++; }
    public void decAge(){ if (age>0) age--; }
    public void incAge(int n){ age += n; }
    public void decAge(int n){ age = Math.max(0, age - n); }

    public Student copyObject(){ return new Student(studentID, name, age); }

    @Override public String toString(){
        return "Student{studentID='"+studentID+"', name='"+name+"', age="+age+"}";
    }
}
