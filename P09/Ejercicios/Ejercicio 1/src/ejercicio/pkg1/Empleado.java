
package ejercicio.pkg1;

public class Empleado {
    private int numero;
    private String nombre;
    private double sueldo;
    
    public Empleado(){}
    
    public Empleado(String nombre, int numero, double sueldo){
        this.numero=numero;
        this.nombre=nombre;
        this.sueldo=sueldo;
    }

    public int getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    
    
}
