/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lp3;

/**
 *
 * @author Usuario
 */
public class TestAsociacion {
    public static void main(String[] args) {

        
        Banco bcp = new Banco("BCP");
        Banco bbva = new Banco("BBVA",30);
        
        //bcp
        Persona Deyner = new Persona(1111, "Deyner", "Cuadros");
        Persona Paolo = new Persona(1112, "Paolo", "Rivera");
        Persona Adriel = new Persona(1113, "Adriel", "Pezo");

        bcp.agregarCliente(Deyner);
        bcp.agregarCliente(Paolo);
        bcp.agregarCliente(Adriel);

        bcp.darBajaCliente(Adriel);

        bcp.buscarCliente(Paolo);
        bcp.buscarCliente(Deyner);

        System.out.println(bcp);


        //bbva
        Persona Mario = new Persona(2221, "Mario", "Santillana");
        Persona Fernando = new Persona(2222, "Fernando", "Casapía");
        Persona Gerald = new Persona(2223, "Gerald", "Gomez");

        bbva.agregarCliente(Mario);
        bbva.agregarCliente(Fernando);
        bbva.agregarCliente(Gerald);


        bbva.darBajaCliente(Fernando);

        bbva.buscarCliente(Mario);
        bbva.buscarCliente(Gerald);

        System.out.println(bbva);
}}
