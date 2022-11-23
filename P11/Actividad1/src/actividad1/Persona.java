
package actividad1;

public class Persona implements Contenedora {
    private String nombres;
    private String direccion;
    private String telefono;

    public Persona(String nombres, String direccion, String telefono) {
        this.nombres = nombres;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    
    public String getNombres() {
        return nombres;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean contiene(Object valor) {
        if (this.nombres == valor){
            return true;
        }
        else{
            return false;
        }
    }
    
    
}
