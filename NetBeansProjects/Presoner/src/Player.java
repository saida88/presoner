/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saida
 */
public class Player {

    PlayerStrategy strategy;
    boolean decisio_company;

    public Player(PlayerStrategy strategy) {
        strategy=this.strategy;
    }
    public boolean strategyRival(boolean decisio){
     
        return true;
    }
    public boolean decision (){
        return strategy.desicio();
    } 
    
    public void comunicate(boolean decisio){
       this.decisio_company=decisio;
    }

    public boolean isDecisio_company() {
        return decisio_company;
    }
    
}