/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class EmpleadoAsalariado extends Empleado {
    private double salarioSemanal;

    public EmpleadoAsalariado(double salarioSemanal, String primerNombre, String apellidoPaterno, String numeroSocial) {
        super(primerNombre, apellidoPaterno, numeroSocial);
        this.salarioSemanal = salarioSemanal;
    }

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }

    @Override
    public String toString() {
        return "EmpleadoAsalariado \n" + "salarioSemanal = " + salarioSemanal + "\n" + "Numero social = " + this.getNumeroSocial();
    }
    
    
    @Override
    public double obtenerMontoPago(){
        return getSalarioSemanal();
    }
}
