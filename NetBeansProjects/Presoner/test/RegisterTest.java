/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author saida
 */
public class RegisterTest {
    
     Register r= new Register();
    public RegisterTest() {
       
    }

    

    @Test
    public void testStringstrategygredy() {
        r.getstrategy("gredy");
        assertEquals(r.p.getClass(),new Gredy().getClass());
        
    }
    
     public void testStringotherstrategy() {
        r.getstrategy("random");
        assertEquals(r.p.getClass(),new RandomStrategy().getClass());
        
    }
}
