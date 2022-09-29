/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class Factura implements PorPagar{
    private String numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;

    public Factura(String numeroPieza, String descripcionPieza, int cantidad, double precioPorArticulo) {
        this.numeroPieza = numeroPieza;
        this.descripcionPieza = descripcionPieza;
        this.cantidad = cantidad;
        this.precioPorArticulo = precioPorArticulo;
    }

    public String getNumeroPieza() {
        return numeroPieza;
    }

    public String getDescripcionPieza() {
        return descripcionPieza;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioPorArticulo() {
        return precioPorArticulo;
    }

    public void setNumeroPieza(String numeroPieza) {
        this.numeroPieza = numeroPieza;
    }

    public void setDescripcionPieza(String descripcionPieza) {
        this.descripcionPieza = descripcionPieza;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecioPorArticulo(double precioPorArticulo) {
        this.precioPorArticulo = precioPorArticulo;
    }

    
    
    @Override
    public double obtenerMontoPago()
    {
        return getCantidad() * getPrecioPorArticulo();
    }

    @Override
    public String toString() {
        return "Factura \n" + "numeroPieza = " + numeroPieza +"\n" + "descripcionPieza = " + descripcionPieza +"\n"+ "cantidad = " + cantidad + "\n" + "precioPorArticulo = " + precioPorArticulo;
    }
    
    
}
