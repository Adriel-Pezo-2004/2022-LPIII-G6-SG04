/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author Usuario
 */
public class VentasTotales {
    private final int cantidad_productos = 5;
    private final int cantidad_vendedores = 4;
    
    private final int[][] datos = new int[cantidad_productos][cantidad_vendedores];
    private final int ventas[][] = new int[cantidad_productos][2];
    private final int[] precios = {10,20,30,40,50};
    
    public void cargarDatos(){
        datos[0][0] = 6;
        datos[0][1] = 6;
        datos[0][2] = 5;
        datos[0][3] = 2;
        
        datos[1][0] = 1;
        datos[1][1] = 1;
        datos[1][2] = 8;
        datos[1][3] = 5;
        
        datos[2][0] = 4;
        datos[2][1] = 4;
        datos[2][2] = 4;
        datos[2][3] = 8;
        
        datos[3][0] = 2;
        datos[3][1] = 2;
        datos[3][2] = 5;
        datos[3][3] = 8;
        
        datos[4][0] = 9;
        datos[4][1] = 7;
        datos[4][2] = 5;
        datos[4][3] = 7;
         
    }
    
    public void calcularVentas(){
        for (int i = 0; i < cantidad_productos; i++){
            for (int j = 0; j < cantidad_vendedores; j++){
                if (datos[i][j] > 0){
                    ventas[i][0] += datos[i][j] * precios[i];
                }
            }
        }
        for(int columna = 0; columna < cantidad_vendedores; columna++){
            for (int fila = 0; fila < cantidad_productos; fila++){
                if (datos[fila][columna] > 0){
                    ventas[columna][1] += datos[fila][columna]*precios[fila];
                }
            }
        }
    }
    
    public void mostrarTotales(){
        System.out.printf("%25s\n", "Vendedores");
        System.out.printf("%10s%10s%10s%10s%23s", "1", "2", "3", "4", "Total producto\n\n");
        for (int i = 0; i < cantidad_productos; i++){
            System.out.printf("%d", (i+1));
            for (int j = 0; j < cantidad_vendedores; j++){
                System.out.printf("%10d", datos[i][j]);
                if (j == 3){
                    System.out.printf("%15d", ventas[i][0]);
                }
            }
            System.out.println();
        }
        for (int i = 0; i < cantidad_vendedores; i++){
            System.out.printf("%10d", ventas[i][1]);
        }
    }
}
