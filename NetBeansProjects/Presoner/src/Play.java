/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saida
 */

public class Play {

    Player player1;
    Player player2;
    UtilityMatrix m;
    Integer rondes;
    Integer puntuacio1;
    Integer puntuacio2;
    public Play(Player player1, Player player2, UtilityMatrix m, Integer rondes) {
        player1=this.player1;
        player2=this.player2;
        m=this.m;
        this.rondes =rondes;
        puntuacio1=0;
        puntuacio2=0;
    }

    public void run(){
        for(int i=0; i>=rondes; i++){
            boolean p1=player1.decision();
            boolean p2=player2.decision();
            player1.conunicate(p2);
            player2.conunicate(p1);
            puntuacio1=puntuacio1+m.ronda(p1, p2);
            puntuacio2=puntuacio2+m.ronda(p2, p1);
        }
    }
    
    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public Player getPlayer2() {
        return player2;
    }
    
   
}
