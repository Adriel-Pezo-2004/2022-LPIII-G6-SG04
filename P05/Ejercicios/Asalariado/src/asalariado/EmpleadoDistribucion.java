
package asalariado;

public class EmpleadoDistribucion extends Asalariado{
    private String region;
    private double salario;

    public EmpleadoDistribucion(String region, String nombre, long dni, int diasVacaciones) {
        super(nombre, dni, diasVacaciones);
        this.region = region;
        EmpleadoDistribucion.this.setSalario();
    }
    
    @Override
    public String toString() {
        return "Empleado de Distribucion\n" + 
               "Dni        : " + dni +"\n" +
               "Nombre     : " + nombre +"\n" +         
               "Vacaciones : " + diasVacaciones + "       Region : "+ region +"\n"+           
               "Salario    : " + salario +"\n";      
    }
    
    public void setSalario(){
        salario = salariobase + (salariobase*10/100);    
    }
    
    public double getSalario(){
        return salario;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    
}
