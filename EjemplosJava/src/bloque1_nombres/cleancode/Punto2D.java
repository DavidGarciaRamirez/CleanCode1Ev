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
public class Punto2D {
    private double x, y;

    public double getX() {return x;}
    public void setX(double x) {this.x = x;}
    public double getY() {return y;}
    public void setY(double y) {this.y = y;}

    public Punto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Punto2D() {
        x = 0;
        y = 0;
    }
    
    public String toString() {return x + " , " + y;}
    
    public double distancia(Punto2D Punto2) {
        return Math.sqrt(Math.pow((Punto2.getX() - getX()), 2) + Math.pow((Punto2.getY() - getY()), 2));
    }
}