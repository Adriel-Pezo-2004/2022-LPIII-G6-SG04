
package asalariado;

public class Asalariado {
    protected String nombre;
    protected long dni;
    protected int diasVacaciones;
    protected double salariobase = 1000;

    public Asalariado(String nombre, long dni, int diasVacaciones) {
        this.nombre = nombre;
        this.dni = dni;
        this.diasVacaciones = diasVacaciones;
    }
    
    @Override
    public String toString() {
        return "Empleado Asalariado\n" + 
               "Dni        : " + dni +"\n" +
               "Nombre     : " + nombre +"\n" +         
               "Vacaciones : " + diasVacaciones + "\n"+           
               "Salario    : " + salariobase +"\n";      
    }
        
    public double getSalariobase() {
        return salariobase;
    }
    
    public String getNombre() {
        return nombre;
    }

    public long getDni() {
        return dni;
    }

    public int getDiasVacaciones() {
        return diasVacaciones;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setDiasVacaciones(int diasVacaciones) {
        this.diasVacaciones = diasVacaciones;
    }

}
