/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lp3;

/**
 *
 * @author Usuario
 */
public class Banco {

    private String nombre;
    private Persona clientes[];

    public Banco(String nombre) {
        this(nombre, 20);
    }
    public Banco(String nombre, int numcli) {
        this.nombre = nombre;
        this.clientes = new Persona[numcli];
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setClientes(Persona[] clientes) {
        this.clientes = clientes;
    }
    public Persona[] getClientes() {
        return clientes;
    }

    public void agregarCliente(Persona persona) {
        if (buscarCliente(persona)) {
            System.out.println("La persona ya esta registrada");
        } else {
            int i;
            for (i = 0; i < this.clientes.length; i++) {
                if (this.clientes[i] == null) {
                    break;
                }
            }
            if (i >= this.clientes.length)
                System.out.println("No se puede agregar mas clientes");
            else
                this.clientes[i] = persona;
        }

    }

    public void darBajaCliente(Persona persona) {
        if (buscarCliente(persona)) {
            for (int i = 0; i < this.clientes.length; i++) {
                if (this.clientes[i] != null) {
                    if (this.clientes[i].equals(persona)) {
                        this.clientes[i] = null;
                        System.out.println("Se elimino de la lista a:  " + persona);
                    }
                }
            }
        }
    }

    public boolean buscarCliente(Persona persona) {
        for (int i = 0; i < this.clientes.length; i++) {
            if (this.clientes[i] != null) {
                if (this.clientes[i].equals(persona)) {
                    System.out.println("Se encontro a: " + persona + " con posición: " + i);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String s;
        s = "Banco: " + nombre + "\n";
        for (Persona persona : this.clientes) {
            if (persona != null) {
                s += persona + "\n";
            }
        }
        return s;
    }

}