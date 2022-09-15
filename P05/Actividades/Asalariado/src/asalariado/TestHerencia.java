package asalariado;

/**
 *
 * @author Deyner
 */
public class TestHerencia {

    public static void main(String[] args) {
        Asalariado empleado1 = new Asalariado ("Manuel Cortina",12345678,28);
        EmpleadoProduccion empleado2 = new EmpleadoProduccion ("Noche","Juan Mota",55333222,30);
        EmpleadoDistribucion empleado3 = new EmpleadoDistribucion("Granada","Antonio Camino",55333666,35);
        
        System.out.println("El nombre del empleado 1 es " + empleado1.getNombre());
        System.out.println("El nombre del empleado 2 es " + empleado2.getNombre());
        System.out.println("El turno del empleado 2 es " + empleado2.getTurno());
        System.out.println("El nombre del empleado 3 es " + empleado3.getNombre());
        System.out.println("La region del empleado 3 es " + empleado3.getRegion());
    }
}
