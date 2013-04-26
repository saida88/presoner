/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saida
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int resultat;
         int resultat2;
        UtilityMatrix ut = new UtilityMatrix();
        resultat = ut.ronda(true, false);
        resultat2 = ut.ronda(false, true);
        
        System.out.print(resultat);
        System.out.print(resultat2);
    }
}
