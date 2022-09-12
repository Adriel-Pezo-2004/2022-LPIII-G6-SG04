/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author Paolo
 */
public class main {
    public static void main(String[] args){
        VentasTotales venta = new VentasTotales();
        venta.cargarDatos();
        venta.calcularVentas();
        venta.mostrarTotales();
    } 
    
}
