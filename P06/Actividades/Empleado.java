/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public abstract class Empleado implements PorPagar{
    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSocial;
    

    public Empleado(String primerNombre, String apellidoPaterno, String numeroSocial) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroSocial = numeroSocial;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getNumeroSocial() {
        return numeroSocial;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setNumeroSocial(String numeroSocial) {
        this.numeroSocial = numeroSocial;
    }
    
    
    
}
