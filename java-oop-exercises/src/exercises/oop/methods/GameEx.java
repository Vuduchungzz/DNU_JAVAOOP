package exercises.oop.methods;

public class GameEx {
    private int id;
    private PlayerEx player1;
    private PlayerEx player2;
    public GameEx(){}
    public GameEx(int id, PlayerEx p1, PlayerEx p2){ this.id=id; this.player1=p1; this.player2=p2; }
    public int getId(){ return id; }
    public void setId(int id){ this.id=id; }
    public PlayerEx getPlayer1(){ return player1; }
    public void setPlayer1(PlayerEx player1){ this.player1=player1; }
    public PlayerEx getPlayer2(){ return player2; }
    public void setPlayer2(PlayerEx player2){ this.player2=player2; }

    public PlayerEx getWinner(){
        boolean w1 = player1.isWinner(), w2 = player2.isWinner();
        if (w1 && !w2) return player1;
        if (w2 && !w1) return player2;
        if (w1 && w2) return player1; // ưu tiên player1
        return null;
    }
    public void resetGame(){ player1.setScore(0); player2.setScore(0); }
    public void swapPlayers(){ PlayerEx t = player1; player1 = player2; player2 = t; }

    @Override public String toString(){ return "GameEx{id="+id+", p1="+player1+", p2="+player2+"}"; }
}
