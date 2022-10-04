/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elevador;
import java.util.Scanner;
/**
 *
 * @author Victus
 */
public class TestAscensor {
 
	//Definimos nuestro Ascensor
	private static Ascensor ascensor = null;
 
	private static Scanner teclado = new Scanner(System.in);
 
	public static void main(String[] args) {
 
 
		///Creamos un Ascensor, el usuario nos propocione un piso máximo
		while (ascensor == null) {
			System.out.print("Indique cuál es el piso más alto del edificio: ");
			try {
				int pisoFinal = Integer.parseInt(teclado.nextLine());
				if (pisoFinal < 2)
					System.out.println("Valor inaceptable. Edificio ha de tener mínimo dos pisos");
				else
					ascensor = new Ascensor(pisoFinal); //Podemos construir un Ascensor
			} catch(NumberFormatException ex) {
				System.out.println("Introduzca un valor entero mayor que 1");
			}
		}
 
		//Tenemos ascensor, abrimos menu
		int opcion = 0;
		while (opcion != 4000) {
			System.out.println("\nPiso Actual: " + ascensor.getPisoActual());
			System.out.println("[1] - Subir");
                        System.out.println("[2] - Bajar");
			System.out.println("[4000] - Salir del programa");
			System.out.print("Escoja opción: ");
			try {
				opcion = Integer.parseInt(teclado.nextLine());
				switch(opcion) {
				case 1:
					subir();
					break;
                                case 2:
					bajar();
					break;
				case 4000:
					System.out.println("\nFIN DE PROGRAMA");
					break;
				default:
					System.out.println("Elija entre los valores 1, 2 y 3");
				}
			} catch (NumberFormatException ex) {
				System.out.println("HASTA LUEGO");
			}
		}
 
	}
 
	/**
	 * Pide el número de personas que suben al ascensor y el piso destino
	 * para ordenar al ascensor que se desplace.
	 */
	static void subir() {
		try {
			System.out.print("\n¿Cuántas personas suben al ascensor?: ");
			int personas = Integer.parseInt(teclado.nextLine());
			System.out.print("¿Piso destino?: ");
			int destino = Integer.parseInt(teclado.nextLine());
                        while (destino < ascensor.pisoActual){
                            System.out.print("Ingrese un piso para subir: ");
                            destino = Integer.parseInt(teclado.nextLine());
                        }
                        ascensor.subir(personas, destino);
		} catch(NumberFormatException ex) {
			System.out.println("Error. Solo se admiten números enteros.");
		} catch (Exception e) { //Aquí capturamos las excepciones que lanza el Ascensor
			System.out.println(e.getMessage());
		}
	}
        
        static void bajar() {
		try {
			System.out.print("\n¿Cuántas personas suben al ascensor?: ");
			int personas = Integer.parseInt(teclado.nextLine());
			System.out.print("¿Piso destino?: ");
			int destino = Integer.parseInt(teclado.nextLine());
                        while (destino > ascensor.pisoActual){
                            System.out.print("Ingrese un piso para bajar: ");
                            destino = Integer.parseInt(teclado.nextLine());
                        }
			ascensor.subir(personas, destino);
		} catch(NumberFormatException ex) {
			System.out.println("Error. Solo se admiten números enteros.");
		} catch (Exception e) { //Aquí capturamos las excepciones que lanza el Ascensor
			System.out.println(e.getMessage());
		}
	}
 
}
