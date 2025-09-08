package exercises.oop.inheritance.animal;

public class Cat extends Animal {
    private String color;
    private String breed; // theo đề dùng "giới tính" nhưng hợp lý hơn: breed = giống loài

    public Cat(){}
    public Cat(String name, int age, String color, String breed){
        super(name, age);
        this.color=color; this.breed=breed;
    }

    public String getColor(){ return color; }
    public void setColor(String color){ this.color=color; }
    public String getBreed(){ return breed; }
    public void setBreed(String breed){ this.breed=breed; }

    @Override public String toString(){
        return "Cat{name='"+getName()+"', age="+getAge()+", color='"+color+"', breed='"+breed+"'}";
    }

    public boolean equalBreed(Cat c){ return this.breed!=null && this.breed.equals(c.breed); }
}
