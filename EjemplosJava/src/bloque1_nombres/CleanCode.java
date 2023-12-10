/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloque1_nombres;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class CleanCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entradaNumero = new Scanner(System.in);
        String introducido;
        
        System.out.print("Introduzca un número: ");
        introducido = entradaNumero.nextLine();
        
        System.out.printf("El número introducido es %s y su inverso es %s.\n", introducido, invertir(introducido));
    }
    
    public static String invertir(String introducido) {
        String invertido = "";
        char[] introducidoArray = introducido.toCharArray();
        int descenso = introducido.length() - 1;
        
        while (descenso >= 0) {
            invertido += introducidoArray[descenso];
            descenso--;
        }
        
        return invertido;
    }
}
