/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author Usuario
 */
public class Edificio implements ImpactoEcologico{
    private double usoLuz;
    private double usoAgua;
    private String tipoDeEdificio;
    private final double factorEmision = 0.5;

    public Edificio(String tipoDeEdificio, double usoLuz, double usoAgua) {
        this.usoLuz = usoLuz;
        this.usoAgua = usoAgua;
        this.tipoDeEdificio = tipoDeEdificio;
    }

    public double getUsoLuz() {
        return usoLuz;
    }

    public double getUsoAgua() {
        return usoAgua;
    }

    public String getTipoDeEdificio() {
        return tipoDeEdificio;
    }

    public void setUsoLuz(double usoLuz) {
        this.usoLuz = usoLuz;
    }

    public void setUsoAgua(double usoAgua) {
        this.usoAgua = usoAgua;
    }

    public void setTipoDeEdificio(String tipoDeEdificio) {
        this.tipoDeEdificio = tipoDeEdificio;
    }
    
    public double dato_actividad(){
        return (getUsoLuz() * getUsoAgua()) * Math.sqrt(2);
    }
    
    @Override
    public double impacto_ecologico(){
        return dato_actividad() * factorEmision;
    }

    @Override
    public String toString() {
        return "Tipo de contaminante: "  + this.tipoDeEdificio  + "\n" + "Uso de luz = " + this.usoLuz +"\n" + "Uso de agua = " + this.usoAgua;
    }
    
    
}
