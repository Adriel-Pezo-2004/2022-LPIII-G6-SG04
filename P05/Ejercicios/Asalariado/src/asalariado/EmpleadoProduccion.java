package asalariado;

import java.util.HashSet;
import java.util.Set;

public class EmpleadoProduccion extends Asalariado {
    private String turno;
    private double salario = salariobase * (15/100);
    
    public void setSalario(){
        salario = salariobase + (salariobase*15/100);    
    }

    public EmpleadoProduccion(String turno, String nombre, long dni, int diasVacaciones) {
        super(nombre, dni, diasVacaciones);
        this.turno = turno;
        EmpleadoProduccion.this.setSalario();
        
    }
    
    @Override
    public String toString() {
        return "Empleado de Produccion\n" + 
               "Dni        : " + dni +"\n" +
               "Nombre     : " + nombre +"\n" +         
               "Vacaciones : " + diasVacaciones + "       Turno : "+ turno +"\n"+           
               "Salario    : " + salario +"\n";      
    }
    
    public double getSalario(){
        return salario;
    }
    
    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    
}
