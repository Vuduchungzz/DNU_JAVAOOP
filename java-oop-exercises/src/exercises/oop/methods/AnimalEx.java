package exercises.oop.methods;

public class AnimalEx {
    private String name;
    private String color;
    private int age;

    public AnimalEx(){}
    public AnimalEx(String name, String color, int age){ this.name=name; this.color=color; this.age=age; }

    public String getName(){ return name; }
    public void setName(String name){ this.name=name; }
    public String getColor(){ return color; }
    public void setColor(String color){ this.color=color; }
    public int getAge(){ return age; }
    public void setAge(int age){ this.age=age; }

    public int getYearOfBirth(){ return java.time.Year.now().getValue() - age; }
    public boolean equalsColor(AnimalEx a){ return this.color != null && this.color.equals(a.color); }
    public void increaseAge(){ this.age++; }

    @Override public String toString(){ return "AnimalEx{name='"+name+"', color='"+color+"', age="+age+"}"; }
}
