/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejericicio1;

/**
 *
 * @author Usuario
 */
public class Circulo extends FiguraBidimensional{
    private double radio;

    public Circulo(double radio, String objetoFigura, String tipoFigura) {
        super(objetoFigura, tipoFigura);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double areaFigura(){
       return 3.141592 * (getRadio() * getRadio()); 
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
