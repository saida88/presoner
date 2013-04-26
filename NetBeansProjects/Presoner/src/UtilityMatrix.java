/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saida
 */
public class UtilityMatrix {
    int T= 3;
    int R= 2;
    int P=1;
    int S=0;

    public UtilityMatrix() {
        
    }
    
    public Integer ronda (boolean p1, boolean p2){
        if(p1==true && p2==true)
            return R;
        else if (p1==false && p2==false)
            return P;
        else if (p1==false && p2==true)
            return S;
        else
            return T;
    }
    
    
}
