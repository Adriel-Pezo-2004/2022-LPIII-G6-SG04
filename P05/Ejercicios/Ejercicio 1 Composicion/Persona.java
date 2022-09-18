/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lp3;


/**
 *
 * @author Usuario
 */
public class Persona {
    private int id;
    private String nombre;
    private String apellido;
    private char tipoCliente;
    private Cuenta cuenta;

    public Persona(int id, String nombre,String apellido,char tipoCliente) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoCliente = tipoCliente;
        if (tipoCliente == 'C'){
            this.cuenta = new Cuenta(1000);
        }
        if (tipoCliente == 'B'){
            this.cuenta = new Cuenta(5000);
        }
        if (tipoCliente == 'E'){
            this.cuenta = new Cuenta(8000);
        }
    }
    
    public Persona(int id, String nombre,String apellido) {
	this(id,nombre,apellido,'C');
    } 

    public Persona(int id){
	this(id, "", "", 'C');
    }
    
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    public char getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(char tipoCliente) {
	this.tipoCliente = tipoCliente;
    }
    
    @Override
    public String toString() {
	return "Cliente :   " + this.id + "\nTipo:  " + this.tipoCliente + "\nNombres :	 " + this.nombre+" " + this.apellido;
    }

}
