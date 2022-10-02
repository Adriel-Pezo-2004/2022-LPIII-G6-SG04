/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejericicio1;

/**
 *
 * @author Usuario
 */
public class Cuadrado extends FiguraBidimensional {
    private double lado;

    public Cuadrado(double lado, String objetoFigura, String tipoFigura) {
        super(objetoFigura, tipoFigura);
        this.lado = lado;
    }


    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public double areaFigura(){
       return (getLado() * getLado()); 
    }
    
    @Override
    public double volumenFigura(){
        return 0;
    }

    @Override
    public String toString() {
        return "Tipo de objeto:"  + this.objetoFigura + "\n" + "Tipo de figura = " + this.tipoFigura +"\n" + "Tipo de objeto = " + this.objetoFigura;

    }
    
    
    
}
