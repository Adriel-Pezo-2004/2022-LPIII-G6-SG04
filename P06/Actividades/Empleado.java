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
    
    
}
