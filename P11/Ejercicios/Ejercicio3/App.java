/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Usuario
 */
import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws ObjectNoExist {
		Scanner sc = new Scanner(System.in);
                int opcion;
		boolean salir = false;

		
		Dictionary agenda = new Dictionary();

                while (!salir){
                        menu();
			opcion = sc.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("Ingreso de los datos");
				System.out.println("DNI: ");
				int dni = sc.nextInt();
				sc.nextLine();
				System.out.println("NOMBRE: ");
				String nombre = sc.nextLine();
				System.out.println("TELEFONO: ");
				int telefono = sc.nextInt();
				sc.nextLine();
				System.out.println("DIRRECCION: ");
				String direccion = sc.nextLine();
				Contacts contacto = new Contacts(dni,nombre,telefono,direccion);
				agenda.add(dni,contacto);
				break;
			case 2:
				System.out.println("DNI: ");
				int dniBuscar = sc.nextInt();
				try {
					
					System.out.println(agenda.getValue(dniBuscar).toString());
				}
				catch(ObjectNoExist e) {
					System.out.println("El contacto no se encuentra en la agenda");
				}
				break;
			case 3:
				System.out.println("DNI: ");
				int dniEliminar = sc.nextInt();
				if (agenda.delete(dniEliminar))
					System.out.println("Se borro el contacto CORRECTAMENTE");
				else 
					System.out.println("El contacto no se puedo borrar "
							+ "ya que NO esta en la agenda");
				break;
			case 4:
				ArrayList<OrderedPair> list = agenda.getList();
				System.out.println("AGENDA DE CONTACTOS");
				for (int i =0; i < list.size();i++)
					System.out.println(list.get(i).getValue());
				break;
			case 5:
				//Igualamos el salir a true para que pueda salir del bucle
				salir = true;
				break;
			default:
				//En el caso el usuario digite una opcion que no esta el menu
				//Se le volvera a pedir otra opcion
				System.out.println("Elige una opcion del 1-5");
                
                }
                
	}
    }
    public static void menu() {
		System.out.println("Menu");
		System.out.println("1. Añadir un nuevo contacto");
		System.out.println("2. Encontrar contacto");
		System.out.println("3. Eliminar contacto");
		System.out.println("4. Mostrar contactos");
		System.out.println("5. EXIT\n");
		System.out.print("Elegir una opcion: ");
	}
}
