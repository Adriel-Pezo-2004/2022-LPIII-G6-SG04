/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;
import java.util.*;
/**
 *
 * @author Paolo
 */
public class EvaluacionCrediticia1 {

 

    public static void main(String[] args) {

        final int evaluados=8;
        int lista[][]=new int [3][evaluados];
        rellenoSexo(lista);
        rellenoTrabajo(lista);
        rellenoSueldo(lista);
        imprimirArray(lista);

        System.out.println("Hay un "+porcentajeHombresMujeres(lista, 1)+" % de hombres");
        System.out.println("Hay un "+porcentajeHombresMujeres(lista, 2)+" % de mujeres");
        System.out.println("Hay un "+porcHombresMujeresTrabajo(lista, 1, 1)+" % de hombres que trabajan");
        System.out.println("Hay un "+porcHombresMujeresTrabajo(lista, 2, 1)+" % de mujeres que trabajan");
        System.out.println("Hay un "+porcHombresMujeresTrabajo(lista, 1, 2)+" % de hombres que no tiene trabajo");
        System.out.println("Hay un "+porcHombresMujeresTrabajo(lista, 2, 2)+" % de mujeres que no tiene trabajo");
        System.out.println("El sueldo medio es de "+promedioSueldo(lista, 1, 1));
        System.out.println("El sueldo medio es de "+promedioSueldo(lista, 2, 1));

    }

    public static void rellenoSexo (int lista[][]){
    Scanner sn = new Scanner(System.in);
        for (int i=0;i<lista[0].length;i++){
            System.out.println("Ingresar su sexo (1 para masculino y 2 para femenino)");
            int numero = sn.nextInt();
            while (numero < 1 || numero > 2){
            System.out.println("Ingrese los datos correctamente");
            numero = sn.nextInt();
            }
            lista[0][i]=numero;
        }

    }

    public static void rellenoTrabajo (int lista[][]){
    Scanner sn = new Scanner(System.in);
        for (int i=0;i<lista[1].length;i++){
            System.out.println("Si usted trabaja ingrese 1, si no ingrese 2");
            int numero = sn.nextInt();
            while (numero < 1 || numero > 2){
            System.out.println("Ingrese los datos correctamente");
            numero = sn.nextInt();
            }
            lista[1][i]=numero;
        }
    }

    public static void rellenoSueldo (int lista[][]){
    Scanner sn = new Scanner(System.in);

            for (int j=0;j<lista[2].length;j++){

                System.out.println("Ingrese su sueldo (Entre 950 y 3000)");
                int numero = sn.nextInt();
                while (numero < 950 && numero != 0 || numero > 3000){
                    System.out.println("Vuelva a ingresar los datos (El sueldo debe de estar entre 950 y 3000)");
                    numero = sn.nextInt();
                }
                lista[2][j]=numero;
            }
    }

 

    public static void imprimirArray (int lista[][]){

        String datoEncuesta[]={"Sexo", "Trabajo", "Sueldo"};
        for (int i=0;i<lista.length;i++){
            System.out.println(datoEncuesta[i]);
            for (int j=0;j<lista[i].length;j++){
                System.out.println("En la fila " +i+" y columna " +j+ " tiene " +lista[i][j]);
            }
        }
    }

    public static double porcentajeHombresMujeres (int lista[][], int sexo){

        int cont=0;
        for(int i=0;i<lista[0].length;i++){
            if (lista[0][i]==sexo){
                cont+=1;
            }
        }
        double porcentaje=(cont*100)/lista[0].length;
        return porcentaje;
    }

    public static double porcHombresMujeresTrabajo (int lista[][], int sexo, int trabajo){
        int contador=0;
        double porcentaje_sexo=0;
        double porcentaje=0;
        for(int i=0;i<lista[0].length;i++){
                if (lista[0][i]==sexo && lista[1][i]==trabajo){
                    contador+=1;
                }
        }
        if(sexo==1){
            porcentaje_sexo=porcentajeHombresMujeres(lista, 1);
            porcentaje=(contador*100)/(porcentaje_sexo/10);
        }else{
            porcentaje_sexo=porcentajeHombresMujeres(lista, 2);
            porcentaje=(contador*100)/(porcentaje_sexo/10);
        }
        return porcentaje;
    }

    public static double promedioSueldo(int lista[][], int sexo, int trabajo){
        int contador=0;
        double suma=0;
        double promedio=0;
        for(int i=0;i<lista[0].length;i++){
                if (lista[0][i]==sexo && lista[1][i]==trabajo && lista[2][i]!=0){
                    suma+=lista[2][i];
                    contador+=1;
                }
        }
        promedio=suma/contador;
        return promedio;
    }
}
