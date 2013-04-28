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
        this.strategy=strategy;
    }
    public void strategyRival(boolean decisio){    
        decisio_company=decisio;
    }
    public boolean decision (){
        return strategy.decisio();
    } 
    

    public boolean isDecisio_company() {
        return decisio_company;
    }
    
}
