/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author Usuario
 */
public class Auto implements ImpactoEcologico{
    private double gasolina;
    private double velocidad;
    private double añosAntiguedad;
    private String tipoAuto;
    private final double factorEmision = 0.3;

    public Auto(String tipoAuto, double gasolina, double velocidad, double añosAntiguedad) {
        this.gasolina = gasolina;
        this.velocidad = velocidad;
        this.añosAntiguedad = añosAntiguedad;
        this.tipoAuto = tipoAuto;
    }

    public String getTipoAuto() {
        return tipoAuto;
    }

    public double getGasolina() {
        return gasolina;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public double getAñosAntiguedad() {
        return añosAntiguedad;
    }
    
    public void setTipoAuto(String tipoAuto) {
        this.tipoAuto = tipoAuto;
    }

    public void setGasolina(double gasolina) {
        this.gasolina = gasolina;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public void setAñosAntiguedad(double añosAntiguedad) {
        this.añosAntiguedad = añosAntiguedad;
    }
    
    public double dato_actividad(){
        return (getGasolina() + getVelocidad()) / getAñosAntiguedad();
    }
    
    @Override
    public double impacto_ecologico(){
        return dato_actividad() * factorEmision;
    }

    @Override
    public String toString() {
        return "Tipo de contaminante: "  + this.tipoAuto  + "\n" + "Cantidad de gasolina = " + this.gasolina +"\n" + "Velocidad promedio = " + this.velocidad +"\n" + "Años de antiguedad = " + this.añosAntiguedad  ;

    }
    
    
}
