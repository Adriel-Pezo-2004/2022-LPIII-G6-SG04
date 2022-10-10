
package actividad1;
import java.util.*;

public class Actividad1 {
    
    public static int cociente (int numerador, int denominador){
        return numerador/denominador;
    }

    public static void main(String[] args) {
        Scanner explorador = new Scanner (System.in);
        System.out.println("Introduzca un numero entero: ");
        int numerador = explorador.nextInt();
        System.out.println("Introduzca un denominador entero: ");
        int denominador = explorador.nextInt();
        
        int resultado = cociente (numerador,denominador);
        System.out.printf("\nResultado: %d / %d\n",numerador,denominador,resultado );
    }
    
}
