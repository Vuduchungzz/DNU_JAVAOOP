package exercises.oop.methods;

public class PlayerEx {
    private String name;
    private int age;
    private int score;
    private int positionX;
    private int positionY;
    public PlayerEx(){}
    public PlayerEx(String name, int age, int score, int x, int y){
        this.name=name; this.age=age; this.score=score; this.positionX=x; this.positionY=y;
    }
    public String getName(){ return name; }
    public void setName(String name){ this.name=name; }
    public int getAge(){ return age; }
    public void setAge(int age){ this.age=age; }
    public int getScore(){ return score; }
    public void setScore(int score){ this.score=score; }
    public int getPositionX(){ return positionX; }
    public void setPositionX(int positionX){ this.positionX=positionX; }
    public int getPositionY(){ return positionY; }
    public void setPositionY(int positionY){ this.positionY=positionY; }

    public void increaseScore(){ score++; }
    public void decreaseScore(){ if (score>0) score--; }
    public void increaseScore(int n){ score += n; }
    public void decreaseScore(int n){ score = Math.max(0, score - n); }
    public boolean isWinner(){ return score >= 100; }

    @Override public String toString(){ return "PlayerEx{name='"+name+"', age="+age+", score="+score+", x="+positionX+", y="+positionY+"}"; }
}
