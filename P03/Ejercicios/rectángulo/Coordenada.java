/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rectángulo;
import java.math.*;
/**
 *
 * @author Deyner
 */
public class Coordenada {
    private int x;
    private int y;

    public Coordenada() {
        this.x = 0;
        this.x = 0;
    }

    public Coordenada(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public Coordenada(Coordenada c){
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public double distancia (Coordenada c){
        double x1;
        double y1;
        double resultado=0.0;
        x1 = c.getX();
        y1 = c.getY();
        x1 = Math.pow(x1, 2);
        y1 = Math.pow(y1, 2);
        resultado = Math.sqrt(x1+y1);
        return resultado;
    }
    
    public static double distancia(Coordenada c1 , Coordenada c2){
        double x1;
        double y1;
        double x2;
        double y2;
        double xR;
        double yR;
        double resultado=0.0;
        x1 = c1.getX();
        y1 = c1.getY();
        x2 = c2.getX();
        y2 = c2.getY();
        xR = Math.pow(x2-x1, 2);
        yR = Math.pow(y2-y1, 2);
        resultado = Math.sqrt(xR+yR);
        return resultado;
    }

    @Override
    public String toString() {
        return "Coordenada{" + "x=" + x + ", y=" + y + '}';
    }
    
    
}

