/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Usuario
 */
public class Soda extends Biscuits {
	private double cantSal;

	public Soda(int id, float price, String forma, double cantSal) {
		super(id, price, "Salada", forma);
		this.cantSal = cantSal;
	}

	public double getCantSal() {
		return this.cantSal;
	}

	public void setCantSal(double cantSal) {
		this.cantSal = cantSal;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Soda) {
			Soda sodaComparar = (Soda) obj;
			return  this.cantSal == sodaComparar.cantSal
					&& this.getForma().equals(sodaComparar.getForma());
		}
		return false;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\tCantidad Sal : " + this.cantSal ;
	}
	
}
