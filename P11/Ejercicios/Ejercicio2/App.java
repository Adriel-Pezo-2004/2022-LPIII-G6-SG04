/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Usuario
 */
public class App {
	public static void main(String[] args) throws ObjectNoExist {
		try {
			Dictionary dict1 = new Dictionary();
			dict1.add(1, "Rivera Paolo");
			dict1.add("Deyner", 30);
			dict1.add(3, 40);

			System.out.println("ADD");
			System.out.println(dict1);
			System.out.println(" ");

			System.out.println("DELETE");
			System.out.println(dict1.delete("Deyner"));
			System.out.println(dict1);
			System.out.println("\n");

			System.out.println("GETVALUE");
			System.out.println(dict1.getValue(3).toString());
			System.out.println(dict1.getValue(1).toString());

		} catch (ObjectNoExist e) {

			System.out.println(e.getMessage());

		}
	}
}