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
        this.player1=player1;
        this.player2=player2;
        this.m=m;
        this.rondes =rondes;
        this.puntuacio1=0;
        this.puntuacio2=0;
    }

    public void run(){
       
        for(int i=0; i<rondes; i++){
            
            boolean d1=player1.decision();
    
            boolean d2=player2.decision();
            puntuacio1=puntuacio1+m.ronda(d1, d2);
            puntuacio2=puntuacio2+m.ronda(d2,d1);
            System.out.print("Ronda:"+i+"Puntuacio jugador 1: "+puntuacio1+"Puntuacio jugador 2: "+puntuacio2+"\n");
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

    public Integer getPuntuacio1() {
        return puntuacio1;
    }

    public Integer getPuntuacio2() {
        return puntuacio2;
    }

    public Integer getRondes() {
        return rondes;
    }
    
   
}
