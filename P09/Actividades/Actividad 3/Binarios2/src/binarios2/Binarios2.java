/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binarios2;

/**
 *
 * @author Victus
 */

import java.util.Scanner;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.DataOutputStream;



public class Binarios2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        FileOutputStrean fos = null;
        DataoutputStrean salida = null;
        double[][] matriz;
        int filas, columnas, i, j;
        do{
            System.out.print("Numero de filas");
            filas = Sc.nextInt();
        }while(filas <= 0);
        do{
            System.out.print("Numero de filas");
            columnas = Sc.nextInt();
        }while(columnas <= 0);
        
        matriz = new double[filas][columnas];
        for (i = 0; i < filas; i++) {
            for(j = 0; j < columnas; j++){
                System.out.print("matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = Sc.nextDouble();
            }
        }
        try {
            fos = new FileOutputStream("c:/Users/Victus/Documentos/matriz.dat");
            salida = new DataOutputStream(fos);
            
            salida.writeInt(filas);
            salida.writeInt(columnas);
            
            salida.writeInt(filas);
            salida.writeInt(columnas);
            
            for (i = 0; i < filas; i++) {
                for(j = 0; j < columnas; j++){
                    salida.writeDouble(matriz[i][j]);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage()); 
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally{
            try {
                if (fos != null){
                    fos.close();
                }
                if (salida != null){
                    salida.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }  
}
