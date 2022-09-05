/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rectángulo;
import java.math.*;
import java.util.HashSet;

/**
 *
 * @author Deyner
 */
public class Manejador {

    public Manejador() {
    }
    
    public double area(Rectangulo c){
        double area = 0.0;
        double base;
        double altura;
        double x1;
        double y1;
        double x2;
        double y2;
        x1 = c.getEsquina1().getX();
        y1 = c.getEsquina1().getY();
        x2 = c.getEsquina2().getX();
        y2 = c.getEsquina2().getY();
        base = Math.abs(x1-x2);
        altura = Math.abs(y2-y1);
        area = base*altura;
        return area;
    }
    public double perimetro(Rectangulo c){
        double perimetro=0.0;
        double area = 0.0;
        double base;
        double altura;
        double x1;
        double y1;
        double x2;
        double y2;
        x1 = c.getEsquina1().getX();
        y1 = c.getEsquina1().getY();
        x2 = c.getEsquina2().getX();
        y2 = c.getEsquina2().getY();
        base = Math.abs(x1-x2);
        altura = Math.abs(y2-y1);
        perimetro = 2*(base)+2*(altura);
        return perimetro;
    }
    public void moverX(Rectangulo c, int cant){
        int x1;
        int x2;
        x1 = c.getEsquina1().getX();
        x2 = c.getEsquina2().getX();
        x1 = x1 + cant;
        x2 = x2 + cant;
        c.getEsquina1().setX(x1);
        c.getEsquina2().setX(x2);
    }
    public void moverY(Rectangulo c, int cant){
        int y1;
        int y2;
        y1 = c.getEsquina1().getY();
        y2 = c.getEsquina2().getY();
        y1 = y1 + cant;
        y2 = y2 + cant;
        c.getEsquina1().setY(y1);
        c.getEsquina2().setY(y2);
    }
    
}
