/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejericicio1;

/**
 *
 * @author Usuario
 */
public class Triangulo extends FiguraBidimensional {
    private double base;
    private double altura;

    public Triangulo(double base, double altura, String objetoFigura, String tipoFigura) {
        super(objetoFigura, tipoFigura);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public double areaFigura(){
       return (getBase() * getAltura())/2; 
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
