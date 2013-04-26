/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saida
 */
import java.util.Random;

public class RandomStrategy extends PlayerStrategy {
  private boolean decisio;  
 private static Random rnd = new Random();
    
 public RandomStrategy() {
        
    }

    @Override
    public boolean decisio() {
        
         decisio=rnd.nextBoolean();
        
        return decisio;
    }
    
}
