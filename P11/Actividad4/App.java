/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad4;

/**
 *
 * @author Usuario
 */
import java.util.Arrays;

public class App {

	public static void main(String[] args) throws IsFull, IsEmpty, ObjectNoExist {

		try {

			Bag<Goodies> bagGoodies = new Bag<Goodies>(2);
			Goodies g1 = new Goodies(1, "Chupetin", (float) 0.5);
			Goodies g2 = new Goodies(2, "Galletas", (float) 1.20);
			Goodies g3 = new Goodies(3, "Gomitas", (float) 2.50);
			bagGoodies.add(g1);
			bagGoodies.add(g2);
			System.out.println(bagGoodies);
			System.out.print("Se encuentra en la posición: ");
			System.out.println(bagGoodies.getIndex(g1));
			System.out.print("Se encuentra en la posición: ");
			System.out.println(bagGoodies.getIndex(g3));
			System.out.println("Se elimino el objeto con numero : " + bagGoodies.remove(g2));
			System.out.println(bagGoodies);
			bagGoodies.add(g3);
			System.out.println(bagGoodies);
			System.out.println("getObjects");
			System.out.println(Arrays.toString(bagGoodies.getObjects()));
			System.out.println(" ");

			Bag<Chocolates> bagChocolates = new Bag<Chocolates>(2);
			Chocolates choco1 = new Chocolates(1, "Chocolate", (float) 1.5, "Dulce");
			Chocolates choco2 = new Chocolates(2, "Chocolate", (float) 2.5, "Amargo");
			Chocolates choco3 = new Chocolates(3, "Chocolate", (float) 2.5, "Blanco");
			bagChocolates.add(choco1);
			bagChocolates.add(choco2);
			System.out.println(bagChocolates);
			System.out.print("El chocolate dulce se encuentra en la posición: ");
			System.out.println(bagChocolates.getIndex(choco1));
			System.out.print("El chocolate blanco se encuentra en la posición : ");
			System.out.println(bagChocolates.getIndex(choco3));
			System.out.println("getObjects");
			System.out.println(Arrays.toString(bagChocolates.getObjects()));
			System.out.println(" ");

			Bag<Biscuits> bagBiscuits = new Bag<Biscuits>(2);
			Biscuits bis1 = new Biscuits(1, "Galleta", (float) 2.0, "Salada", "Circular");
			Biscuits bis2 = new Biscuits(2, "Galleta", (float) 1.0, "Dulce", "Cuadrado");
                        Biscuits bis3 = new Biscuits(2, "Galleta", (float) 1.5, "Dulce", "Rectangular");
			bagBiscuits.add(bis1);
			bagBiscuits.add(bis2);
                        bagBiscuits.add(bis3);
			System.out.println(bagBiscuits);
			System.out.print("La galleta salada se encuentra en la posición: ");
			System.out.println(bagChocolates.getIndex(choco1));
			System.out.print("La galleta dulce se encuentra en la posición: ");
			System.out.println(bagChocolates.getIndex(choco2));
			System.out.println(" ");
			Bag<Soda> bagSoda = new Bag<Soda>(2);
			Soda sal1 = new Soda(1, "Galleta", (float) 1.0, "Rectangular", 1);
			Soda sal2 = new Soda(1, "Galleta", (float) 1.5, "Circular", 1.1);
			Soda sal3 = new Soda(3, "Galleta", (float) 2.5, "Animal", 3.0);
			bagSoda.add(sal1);
			bagSoda.add(sal2);
                        bagSoda.add(sal3);
			System.out.println(bagBiscuits);
			System.out.print("La galleta salada rectangular esta en: ");
			System.out.println(bagSoda.getIndex(sal1));
			System.out.print("La galleta salada de forma de animal esta en: ");
			System.out.println(bagSoda.getIndex(sal3));
			System.out.println(" ");

			Bag<Sweet> bagSweet = new Bag<Sweet>(2);
			Sweet dul1 = new Sweet(1, "Gomitas", (float) 1.8, "De animales", 5);
			Sweet dul2 = new Sweet(1, "Gomitas", (float) 1.8, "De estrellas", 3);
			Sweet dul3 = new Sweet(3, "Gomitas", (float) 1.7, "De Circulos", 4);
			bagSweet.add(dul1);
                        bagSweet.add(dul2);
			bagSweet.add(dul3);
			System.out.println(bagSweet);
			System.out.print("Las gomitas de animales estan en: ");
			System.out.println(bagSweet.getIndex(dul1));
			System.out.print("Las gomitas con forma de estrellas estan en: ");
			System.out.println(bagSweet.getIndex(dul3));
		} catch (IsFull | IsEmpty | ObjectNoExist exc) {
			System.out.println(exc.getMessage());
		}

	}

}
