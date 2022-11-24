/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad4;

/**
 *
 * @author Usuario
 */
public class Soda extends Biscuits {
	//Atributos
	private double cantSal;

	//Constructor
	public Soda(int id, String descripition, float price, String forma, double cantSal) {
		super(id, descripition, price, "Salada", forma);
		this.cantSal = cantSal;
	}

	//Getters y Setters
	public double getCantSal() {
		return this.cantSal;
	}

	public void setCantSal(double cantSal) {
		this.cantSal = cantSal;
	}

	//Equals
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Soda) {
			Soda sodaComparar = (Soda) obj;
			return  this.cantSal == sodaComparar.cantSal
					&& this.getForma().equals(sodaComparar.getForma());
		}
		return false;
	}
	
	//To String
	@Override
	public String toString() {
		return super.toString()+"\tCantidad Sal : " + this.cantSal ;
	}
	
}
