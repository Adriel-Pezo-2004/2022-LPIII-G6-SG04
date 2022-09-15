package asalariado;

public class EmpleadoProduccion extends Asalariado {
    private String turno;

    public EmpleadoProduccion(String turno, String nombre, long dni, int diasVacaciones) {
        super(nombre, dni, diasVacaciones);
        this.turno = turno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    
}
