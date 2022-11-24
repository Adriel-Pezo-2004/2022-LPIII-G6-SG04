/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Usuario
 */
public class App {

	public static void main(String[] args) throws IsFull, IsEmpty, ObjectNoExist, ExistsList {
		try {

		CandyBags c = new CandyBags(5,"Field");
		Goodies g1 = new Goodies(1,"Cua Cua",(float) 1.0);
		Chocolates c1 = new Chocolates(2,"M&M",(float) 1.20,"Dulce");
		Biscuits b1 = new Biscuits(3,(float) 4.00,"Almendras","Circular");
		Soda s1 = new Soda(4,(float) 3.50,"Kola Escocesa",2.2);
		Sweet sw1 = new Sweet(5,(float) 3.00,"Corazon",9.2);

		c.add(g1);
		c.add(c1);
		c.add(b1);
		c.add(s1);
		c.add(sw1);
                
                
		System.out.println(c);
                System.out.println("\n");
		System.out.println("Más barato");
		System.out.println(c.cheapest());
                System.out.println("\n");
		System.out.println("Mas caro");
		System.out.println(c.mostExpensive(2));
		
                
		}catch(IsFull | ExistsList exc) {
			System.out.println(exc.getMessage());
		}
		

	}

}
