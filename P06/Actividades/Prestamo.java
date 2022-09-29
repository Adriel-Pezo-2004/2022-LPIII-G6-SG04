/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class Prestamo implements PorPagar{
    private int numerocuotas;
    private int montoCuotas;

    public Prestamo(int numerocuotas, int montoCuotas) {
        this.numerocuotas = numerocuotas;
        this.montoCuotas = montoCuotas;
    }

    public int getNumerocuotas() {
        return numerocuotas;
    }

    public int getMontoCuotas() {
        return montoCuotas;
    }

    public void setNumerocuotas(int numerocuotas) {
        this.numerocuotas = numerocuotas;
    }

    public void setMontoCuotas(int montoCuotas) {
        this.montoCuotas = montoCuotas;
    }
    
    @Override
    public double obtenerMontoPago(){
        return getNumerocuotas() * getMontoCuotas();    
    }

    @Override
    public String toString() {
        return "Prestamo \n" + "numerocuotas = " + numerocuotas + "\n"+ "montoCuotas = " + montoCuotas;
    }
    
    
}
