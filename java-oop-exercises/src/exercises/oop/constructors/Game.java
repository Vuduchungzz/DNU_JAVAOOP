package exercises.oop.constructors;

public class Game {
    private int id;
    private Player player1;
    private Player player2;
    public Game(){}
    public Game(int id, Player p1, Player p2){ this.id=id; this.player1=p1; this.player2=p2; }
    public int getId(){ return id; }
    public void setId(int id){ this.id=id; }
    public Player getPlayer1(){ return player1; }
    public void setPlayer1(Player player1){ this.player1=player1; }
    public Player getPlayer2(){ return player2; }
    public void setPlayer2(Player player2){ this.player2=player2; }
    @Override public String toString(){ return "Game{id="+id+", player1="+player1+", player2="+player2+"}"; }
}
