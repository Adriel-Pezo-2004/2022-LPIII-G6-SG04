/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejericicio1;

/**
 *
 * @author Usuario
 */
public class Tetraedro extends FiguraTridimensional{
    private double arista;

    public Tetraedro(double arista, String objetoFiguraT, String tipoFiguraT) {
        super(objetoFiguraT, tipoFiguraT);
        this.arista = arista;
    }

    public double getArista() {
        return arista;
    }

    public void setArista(double arista) {
        this.arista = arista;
    }
    
    
    @Override
    public double areaFigura(){
       return (getArista() * getArista()) * Math.sqrt(3);
    }
    
    @Override
    public double volumenFigura(){
        return ((getArista() * getArista() * getArista()) / 12) * Math.sqrt(2) ;
    }

    @Override
    public String toString() {
        return "Tipo de objeto:"  + this.objetoFiguraT + "\n" + "Tipo de figura = " + this.tipoFiguraT +"\n" + "Tipo de objeto = " + this.objetoFiguraT;
    }
}
