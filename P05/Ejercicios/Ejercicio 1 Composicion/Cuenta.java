/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lp3;

/**
 *
 * @author Usuario
 */
public class Cuenta {
    private int numero;
    private double saldo;

    public Cuenta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }
    
    public Cuenta(int numero){
        this (numero, 0);
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void retirar(int cantidad) {
	this.saldo -= cantidad;	

    }
	
    public void depositar(int cantidad) {
	this.saldo  += cantidad;	
	}
    
    @Override
    public String toString() {
        return "\nNo. Cuenta : "+this.numero+"\tSaldo:"+this.saldo ;
    }
}

    
