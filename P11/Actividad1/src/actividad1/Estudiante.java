
package actividad1;

public class Estudiante extends Persona {
    private String especialidad;
    private Procedencia procedencia;

    public Estudiante(String especialidad, String departamento, String provincia, String nombres, String direccion, String telefono) {
        super(nombres, direccion, telefono);
        this.especialidad = especialidad;
        this.procedencia.setDepartamento(departamento);
        this.procedencia.setProvincia(provincia);
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public Procedencia getProcedencia() {
        return procedencia;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setProcedencia(String departamento, String provincia) {
        this.procedencia.setDepartamento(departamento);
        this.procedencia.setProvincia(provincia);
    }
    
    public boolean contiene(Object valor, Object valor2) {
        if ( getNombres() == valor && this.procedencia == valor2){
            return true;
        }
        else{
            return false;
        }
    }
    
}
