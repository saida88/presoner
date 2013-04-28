/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saida
 */
public class Register {

    public static  PlayerStrategy p;
    
    public Register() {
        
    }
    public PlayerStrategy getstrategy(String s){
        
        if("gredy".equals(s))
            p=new Gredy();
        else if("cooperator".equals(s))
            p=new Cooperator();
        else if("ramdom".equals(s))
            p=new RandomStrategy();
       else
            p=new CompositeStrategy();
        
        return p;
    }
    
}
