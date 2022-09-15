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
        
        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());
        System.out.println(empleado3.toString());
    }
}
