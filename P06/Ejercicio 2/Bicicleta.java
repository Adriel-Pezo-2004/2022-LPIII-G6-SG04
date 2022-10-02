/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author Usuario
 */
public class Bicicleta implements ImpactoEcologico{
    private String tipoBicicleta;
    private double velocidad;
    private double energiaGenerada;
    private double caloriasQuemadas;
    private final double factorEmision = 0.05;

    public Bicicleta(String tipoBicicleta, double velocidad, double energiaGenerada, double caloriasQuemadas) {
        this.tipoBicicleta = tipoBicicleta;
        this.velocidad = velocidad;
        this.energiaGenerada = energiaGenerada;
        this.caloriasQuemadas = caloriasQuemadas;
    }

    public String getTipoBicicleta() {
        return tipoBicicleta;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public double getEnergiaGenerada() {
        return energiaGenerada;
    }

    public double getCaloriasQuemadas() {
        return caloriasQuemadas;
    }

    public void setTipoBicicleta(String tipoBicicleta) {
        this.tipoBicicleta = tipoBicicleta;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public void setEnergiaGenerada(double energiaGenerada) {
        this.energiaGenerada = energiaGenerada;
    }

    public void setCaloriasQuemadas(double caloriasQuemadas) {
        this.caloriasQuemadas = caloriasQuemadas;
    }
    
    public double dato_actividad(){
        return ((getEnergiaGenerada() + getCaloriasQuemadas()) - getVelocidad());
    }
    
    @Override
    public double impacto_ecologico(){
        return dato_actividad() * factorEmision;
    }

    @Override
    public String toString() {
        return "Tipo de contaminante: "  + this.tipoBicicleta  + "\n" + "Velocidad Promedio = " + this.velocidad +"\n" + "Energia generada = " + this.energiaGenerada +"\n" + "Cantidad de calorias quemadas = " + this.caloriasQuemadas  ;
    }
    
    
    
}
