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
    
    public PlayerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Test
    public void testSomeMethod() {
        PlayerStrategy gredy= new Gredy();
        PlayerStrategy cooperator= new Cooperator();
        Player p1=new Player(gredy);
        Player p2= new Player(cooperator);
        UtilityMatrix u= new UtilityMatrix();
        int rondes=1;
        Play p=new Play(p1,p2,u,rondes);
        p.run();
        assertEquals(p.getPuntuacio1(), new Integer(0));
       // assertEquals(p.getPuntuacio2(), new Integer(3));
    }
}
