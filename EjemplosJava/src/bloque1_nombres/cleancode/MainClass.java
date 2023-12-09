/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloque1_nombres.cleancode;

/**
 *
 * @author user
 */
public class MainClass {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Punto2D P = new Punto2D(6.1, 5.2);
        Punto2D Q = new Punto2D(8.9, 10.3);
        Punto3D A = new Punto3D(2.3, 4.3, 3.4);
        Punto3D B = new Punto3D(0, 0, 0);
        
        System.out.println("COORDENADAS DE LOS PUNTOS:");
        System.out.println("Punto P(" + P + ")");
        System.out.println("Punto Q(" + Q + ")");
        System.out.println("Punto A(" + A + ")");
        System.out.println("Punto B(" + B + ")");
        System.out.println("");
        
        System.out.println("DISTANCIA ENTRE LOS PUNTOS:");
        System.out.printf("Distancia entre P y Q: %.2f\n", P.distancia(Q));
        System.out.printf("Distancia entre B y A: %.2f\n", A.distancia(B));
    }
}