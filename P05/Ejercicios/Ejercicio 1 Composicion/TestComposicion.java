/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lp3;

/**
 *
 * @author Usuario
 */
public class TestComposicion {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta(1000);
	Persona p1 = new Persona(100,"Paolo", "Rivera");
	System.out.println(p1);
	c1.depositar(500);
	System.out.println(c1);	
    }
}
