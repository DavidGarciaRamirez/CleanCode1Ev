/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam1garciaramirez_david_ej0501b10punto3d;

/**
 *
 * @author user
 */
public class Punto3D extends Punto2D{
    private double z;

    public double getZ() {return z;}
    public void setZ(double z) {this.z = z;}

    public Punto3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public Punto3D() {
        super();
        z = 0;
    }
    
    public String toString() {return super.toString() + " , " + z;}
    
    public double distancia(Punto3D Punto2) {
        return Math.sqrt(Math.pow((Punto2.getX() - getX()), 2) + Math.pow((Punto2.getY() - getY()), 2) + Math.pow((Punto2.getZ() - getZ()), 2));
    }
}
