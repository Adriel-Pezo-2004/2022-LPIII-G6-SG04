/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author Paolo
 */
public class PerfilMedico {
    private String nombre;
    private String apellido;
    private String sexo;
    private int dia;
    private int mes;
    private int año;
    private double altura;
    private double peso;
    private double fcm;
    private double imc;
    private int edad;
    
    public PerfilMedico(String nombre, String apellido, String sexo, int dia, int mes, int año, double altura, double peso, double fcm, double imc, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.altura = altura;
        this.peso = peso;
        this.imc = imc;
        this.fcm = fcm;
        this.edad = edad;
    }
    
    public double getImc(){
        return imc;
    }
    public double getFcm(){
        return fcm;
    }
    public int getEdad(){
        return edad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setImc(double imc){
        this.imc = imc;
    }
    public void setFcm(double fcm){
        this.fcm = fcm;
    }
       
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    
   public void edadMetodo(int dia, int mes, int año, int diaHoy, int mesHoy, int añoHoy, int edad){
       this.edad = añoHoy - año;
       if (mesHoy <= mes){
           this.edad--;
       }
       else if(mesHoy == mes && diaHoy < dia){
           this.edad--;
       }
   }
   
   public void fcm(int edad, double fcm){
       this.fcm = 208-0.7 * edad;
   }
    
   public void imc(double peso, double altura, double imc){
       this.imc = peso/altura;
   }

    public static void main(String[] args) {
        String nombre;
        String apellido;
        String sexo;
        int dia;
        int mes;
        int año;
        int diaActual;
        int mesActual;
        int añoActual;
        double altura;
        double peso;
        int edad = 0;
        double fcm = 0;
        double imc = 0;      
        
        Scanner s1 = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        nombre = s1.next();
        System.out.println("Ingrese su apellido: ");
        apellido = s1.next();
        System.out.println("Ingrese su sexo (M/F) ");
        sexo = s1.next();
        System.out.println("Ingrese su dia de nacimiento: ");
        dia = s1.nextInt();
        System.out.println("Ingrese su mes de nacimiento: ");
        mes = s1.nextInt();
        System.out.println("Ingrese su año de nacimiento: ");
        año = s1.nextInt();
        System.out.println("Ingrese el dia actual: ");
        diaActual = s1.nextInt();
        System.out.println("Ingrese el mes actual: ");
        mesActual = s1.nextInt();
        System.out.println("Ingrese el año actual: ");
        añoActual = s1.nextInt();
        System.out.println("Ingrese su altura en cm: ");
        altura = s1.nextDouble();
        System.out.println("Ingrese su Peso: ");
        peso = s1.nextDouble();
       
        PerfilMedico Usuario = new PerfilMedico(nombre, apellido, sexo, dia, mes, año, altura, peso, fcm, imc, edad);
        
        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(sexo);
        System.out.println(dia+"/"+mes+"/"+año);
        System.out.println(altura);
        System.out.println(peso);
        System.out.println(Usuario.toString());
        
        Usuario.edadMetodo(dia, mes, año, diaActual, mesActual, añoActual, edad);
        Usuario.fcm(Usuario.getEdad(), fcm);
        Usuario.imc(peso, altura, Usuario.getImc());
        
        System.out.println("Su edad es: " + Usuario.getEdad());
        System.out.println("Su frecuencia cardiaca maxima es: " + Usuario.getFcm());
        System.out.println("Su indice de masa corporal es: " + Usuario.getImc());
        
        
        
        
        
        
        
        
        
        
        
        
        }
    
}
