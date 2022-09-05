/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rectángulo;

/**
 *
 * @author Deyner
 */
public class Rectángulo {
    
    public static void main(String[] args) {
        
    Rectangulo RUsuario = new Rectangulo(4,5);    
    Manejador Manejador = new Manejador();
    System.out.println("El area del rectangulo es: " + Manejador.area(RUsuario));
    System.out.println("El perimetro del rectangulo es: " + Manejador.perimetro(RUsuario));
    Manejador.moverX(RUsuario, 5);
    Manejador.moverX(RUsuario, 2);
    System.out.println(RUsuario.toString());
    Rectangulo RAmarillo = new Rectangulo(1,2);
    System.out.println("Rectangulo de color Amarillo: " + RAmarillo.toString());
    Rectangulo RRojo = new Rectangulo(3,5);
    System.out.println("Rectangulo de color Rojo: " + RRojo.toString());
    Rectangulo RVerde = new Rectangulo(2,4);
    System.out.println("Rectangulo de color Verde: " + RVerde.toString());
    }
    
}
