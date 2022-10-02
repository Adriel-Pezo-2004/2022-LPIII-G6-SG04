/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejericicio1;

/**
 *
 * @author Usuario
 */
public class Esfera extends FiguraTridimensional {
    private double radio;

    public Esfera(double radio, String objetoFiguraT, String tipoFiguraT) {
        super(objetoFiguraT, tipoFiguraT);
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
       return 4 * 3.141592 * (getRadio() * getRadio());
    }
    
    @Override
    public double volumenFigura(){
        return 4/3 * 3.141592 * (getRadio() * getRadio() * getRadio());
    }

    @Override
    public String toString() {
        return "Tipo de objeto:"  + this.objetoFiguraT + "\n" + "Tipo de figura = " + this.tipoFiguraT +"\n" + "Tipo de objeto = " + this.objetoFiguraT;
    }
}
