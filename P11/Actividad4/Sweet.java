/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad4;

/**
 *
 * @author Usuario
 */
public class Sweet extends Biscuits {
	// Atributos
	private double cantAzucar;

	// Constructor
	public Sweet(int id, String descripition, float price, String forma, double cantAzucar) {
		super(id, descripition, price, "Dulce", forma);
		this.cantAzucar = cantAzucar;
	}

	// Setters y Getters
	public double getCantAzucar() {
		return this.cantAzucar;
	}

	public void setCantAzucar(double cantAzucar) {
		this.cantAzucar = cantAzucar;
	}

	// Equals
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Sweet) {
			Sweet sodaComparar = (Sweet) obj;
			return this.cantAzucar == sodaComparar.cantAzucar
					&& this.getForma().equals(sodaComparar.getForma());
		}
		return false;
	}

	// To String
	@Override
	public String toString() {
		return super.toString() + "\tCantidad de Azucar: " + this.cantAzucar;
	}

}
