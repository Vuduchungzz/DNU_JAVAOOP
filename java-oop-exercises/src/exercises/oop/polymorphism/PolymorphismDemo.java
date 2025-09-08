package exercises.oop.polymorphism;

public class PolymorphismDemo {
    public static void main(String[] args) {
        Student s = new Student("SV001","Khai",20);
        StudentIT it = new StudentIT("SV002","Lan",19, 9.5f, 8.0f);
        StudentBA ba = new StudentBA("SV003","Minh",21, 7.5f, 8.5f);

        // Gọi đa hình:
        Student[] arr = new Student[]{s, it, ba};
        for (Student st : arr) {
            System.out.println(st.toString());
        }

        System.out.println("Copy IT: " + it.copyObject());
        System.out.println("Copy BA: " + ba.copyObject());
    }
}
