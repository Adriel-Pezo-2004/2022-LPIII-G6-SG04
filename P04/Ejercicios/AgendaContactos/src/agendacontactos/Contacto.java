package agendacontactos;

/**
 *
 * @author Deyner
 */
public class Contacto {
    private String nombre;
    private int telefono;
    private String dirrecion;

    public Contacto(String nombre, int telefono, String dirrecion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.dirrecion = dirrecion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getDirrecion() {
        return dirrecion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setDirrecion(String dirrecion) {
        this.dirrecion = dirrecion;
    }
    
}
