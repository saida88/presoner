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
public class PlayerTest {
        PlayerStrategy gredy= new Gredy();
        PlayerStrategy cooperator= new Cooperator();
        Player p1=new Player(gredy);
        Player p2= new Player(cooperator);        
        UtilityMatrix u= new UtilityMatrix();
        Play p=new Play(p1,p2,u,2);
    public PlayerTest() {
    }

    @Test
    public void testdecision() {       
        assertEquals(cooperator.decisio(),p2.decision());
    }
    
    @Test
    public void testKnowstrategyfriend() {
        p.run();       
        assertEquals(p1.isDecisio_company(),p2.decision());
    }
}
