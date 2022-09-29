/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class PruebaInterfazPorPagar {
    public static void main(String[] args) {
        PorPagar[] objetosPorPagar = new PorPagar[5];
        
        objetosPorPagar[0] = new Factura("0111", "asiento", 2, 375.00);
        objetosPorPagar[1] = new Factura("0112", "llanta", 2, 675.00);
        objetosPorPagar[2] = new EmpleadoAsalariado(800.00,"Arthur", "Morgan", "1111-1111");
        objetosPorPagar[3] = new EmpleadoAsalariado(1000.00,"Maria", "Perez", "1112-1112");
        objetosPorPagar[4] = new Prestamo(10, 100);
        
        System.out.println("Facturas y empleados procesados de manera polimorfica: \n");
        
        for (PorPagar porPagarActual : objetosPorPagar)
        {
            System.out.printf("%s \n%s: $%, .2f\n\n", porPagarActual.toString(), "pago vencido", porPagarActual.obtenerMontoPago());
        }
    }
 
}
