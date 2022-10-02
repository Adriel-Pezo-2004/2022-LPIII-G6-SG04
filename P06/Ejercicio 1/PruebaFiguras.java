/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejericicio1;

/**
 *
 * @author Usuario
 */
public class PruebaFiguras {
    public static void main(String[] args) {
        Figura[] FigurasGeometricas;
        FigurasGeometricas = new Figura[6];
        
        FigurasGeometricas[0] = new Circulo(12, "Circulo", "Figura Bidimensional");
        FigurasGeometricas[1] = new Cuadrado(4, "Cuadrado", "Figura Bidimensional");
        FigurasGeometricas[2] = new Triangulo(10, 6,  "Triangulo", "Figura Bidimensional");
        FigurasGeometricas[3] = new Esfera(5, "Esfera", "Figura Tridimensional");
        FigurasGeometricas[4] = new Cubo(15, "Cubo", "Figura Tridimensional");
        FigurasGeometricas[5] = new Tetraedro(9, "Tetraedro", "Figura Tridimensional");
        
        for(Figura FigurasActuales : FigurasGeometricas){
        
            System.out.println(FigurasActuales.toString());
            
            if (FigurasActuales instanceof  FiguraBidimensional){
                System.out.println("El area de la figura es: " + FigurasActuales.areaFigura() + "\n");
            }
            else if (FigurasActuales instanceof  FiguraTridimensional){
                System.out.println("El area de la figura es: " + FigurasActuales.areaFigura());
                System.out.println("El volumen de la figura es: " + FigurasActuales.volumenFigura() + "\n");
            }
        }

        
    }
}
