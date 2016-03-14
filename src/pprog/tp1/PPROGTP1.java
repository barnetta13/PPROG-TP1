/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pprog.tp1;

/**
 *
 * @author Daniel Martins
 */
public class PPROGTP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Automovel a1 = new Automovel("11-A1-11",2016,5.0,200,1900);
        Automovel a2 = new Automovel("22-A2-22",2015,8.0,50,1200);
        Automovel a3 = new Automovel();
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
        Automovel.setLimiteRecente(3);
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
        
    }
    
}
