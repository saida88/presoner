
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saida
 */
public class CompositeStrategy extends PlayerStrategy{

    protected List <PlayerStrategy> strategies= new ArrayList <PlayerStrategy> ();
    private static Random rnd = new Random();
    protected Integer i = 0;
    
    public CompositeStrategy() {
        strategies.add(new RandomStrategy());
        strategies.add(new Gredy());
        strategies.add(new Cooperator());
        
    }

    @Override
    public boolean desicio() {
      
         super.decisio=strategies.get(rnd.nextInt(3)).desicio();
       
        return decisio;
    }
    
}
