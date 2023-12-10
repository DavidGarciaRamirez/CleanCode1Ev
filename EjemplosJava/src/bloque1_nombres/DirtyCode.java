/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloque1_nombres;
/**
 *
 * @author user
 */
public class DirtyCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.printf("El número introducido es %s y su inverso es %s.\n", 100, inversion(100));
    }
    
    public static String inversion(int n) {
        String i = "";
        char[] dtos = ;
        
        for (int d = n.length() - 1; d >= 0; d--)
            i += dtos[d];
        
        return i;
    }
}
