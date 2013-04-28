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
public class PlayTest {
        PlayerStrategy gredy= new Gredy();
        PlayerStrategy cooperator= new Cooperator();
        Player p1=new Player(gredy);
        Player p2= new Player(cooperator);        
        UtilityMatrix u= new UtilityMatrix();
    public PlayTest() {
        
    }

    @BeforeClass
    public static void setUpClass() {
        
        
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Test
    public void testoneplayonerond() {   
        Play p=new Play(p1,p2,u,1);
        p.run();
        assertEquals(p.getPuntuacio1(), new Integer(0));
        assertEquals(p.getPuntuacio2(), new Integer(3));
    }
    @Test
    public void testmoreplayonerond() {   
        Play p=new Play(p1,p2,u,5);
        p.run();
        assertEquals(p.getPuntuacio1(), new Integer(0));
        assertEquals(p.getPuntuacio2(), new Integer(15));
    }
}
