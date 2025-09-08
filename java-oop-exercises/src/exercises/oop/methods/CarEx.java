package exercises.oop.methods;

public class CarEx {
    private String color;
    private String name;
    private int seatingCapacity;
    private int year;
    public CarEx(){}
    public CarEx(String color, String name, int seatingCapacity, int year){
        this.color=color; this.name=name; this.seatingCapacity=seatingCapacity; this.year=year;
    }
    public String getColor(){ return color; }
    public void setColor(String color){ this.color=color; }
    public String getName(){ return name; }
    public void setName(String name){ this.name=name; }
    public int getSeatingCapacity(){ return seatingCapacity; }
    public void setSeatingCapacity(int seatingCapacity){ this.seatingCapacity=seatingCapacity; }
    public int getYear(){ return year; }
    public void setYear(int year){ this.year=year; }
    public int getAge(){ return java.time.Year.now().getValue() - year; }

    @Override public String toString(){ return "CarEx{color='"+color+"', name='"+name+"', seating="+seatingCapacity+", year="+year+"}"; }
}
