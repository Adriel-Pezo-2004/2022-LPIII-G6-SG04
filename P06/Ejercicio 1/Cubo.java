/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejericicio1;

/**
 *
 * @author Usuario
 */
public class Cubo extends FiguraTridimensional{
    private double lado;

    public Cubo(double lado, String objetoFiguraT, String tipoFiguraT) {
        super(objetoFiguraT, tipoFiguraT);
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
       return 6 * (getLado() * getLado());
    }
    
    @Override
    public double volumenFigura(){
        return (getLado() * getLado() * getLado());
    }

    @Override
    public String toString() {
        return "Tipo de objeto:"  + this.objetoFiguraT + "\n" + "Tipo de figura = " + this.tipoFiguraT +"\n" + "Tipo de objeto = " + this.objetoFiguraT;
    }
}
