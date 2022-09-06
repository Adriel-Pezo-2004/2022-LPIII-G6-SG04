/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz4x4;
import java.util.*;
/**
 *
 * @author Deyner
 */
public class Matriz4x4 {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        //Matriz cuadrada de 4x4
        int matriz[][] = new int[4][4];
    //Variables utilizadas
    boolean salir = false;
    int opcion, fila, columna;
    //Utilizado para indicar si hemos entrado en la 1ª opcion
    boolean rellenado = false;
    //Menu
    do {
        //Mensajes del menu
        System.out.println("Menu");
        System.out.println("1. Rellenar Matriz");
        System.out.println("2. Sumar fila");
        System.out.println("3. Sumar columna");
        System.out.println("4. Sumar diagonal principal");
        System.out.println("5. Sumar diagonal inversa");
        System.out.println("6. Media de todos los valores");
        System.out.println("7. Salir");
        System.out.println("Elije una opcion");
        opcion = sn.nextInt();
        switch (opcion) {
            case 1:
                rellenarMatriz(sn, matriz);
                //Ahora si podemos acceder al resto de opciones
                rellenado = true;
                break;
            case 2:
                if (rellenado) {
                    //Validamos la fila
                    do {
                        System.out.println("Elige una fila");
                        fila = sn.nextInt();
                    } while (!(fila >= 0 && fila < matriz.length));
                    System.out.println("La suma de los valores de la fila " + fila
                        + " es: " + sumaFila(matriz, fila));
                } else {
                    System.out.println("Debes rellenar la matriz primero");
                }
                break;
            case 3:
                if (rellenado) {
                    //Validamos la fila
                    do {
                        System.out.println("Elige una columna");
                        columna = sn.nextInt();
                    } while (!(columna >= 0 && columna < matriz.length));
                    System.out.println("La suma de los valores de la columna " + columna
                        + " es: " + sumaColumna(matriz, columna));
                } else {
                    System.out.println("Debes rellenar la matriz primero");
                }
                break;
            case 4:
                if (rellenado){
                    System.out.println("La suma de los valores de la diagonal principal es "
                        + sumaDiagonal(matriz));
                } else {
                    System.out.println("Debes rellenar la matriz primero");
                }
                break;
            case 5:
                if (rellenado){
                    System.out.println("La suma de los valores de la diagonal inversa es "
                        + sumaDiagonalInversa(matriz));
                } else {
                    System.out.println("Debes rellenar la matriz primero");
                }
                break;
            case 6:
                if (rellenado){
                    System.out.println("La media de todos los valores de la matriz es "
                        + mediaValores(matriz));
                } else {
                    System.out.println("Debes rellenar la matriz primero");
                }
                break;
            case 7:
                salir = true;
                break;
            default:
                System.out.println("Tienes que meter un valor entre 1 y 7");
            }
        } while (!salir);
        System.out.println("FIN");
    }
    /**
    * Rellena la matriz con valores insertados por el usuario
    *
    * @param sn
    * @param matriz
    */
    public static void rellenarMatriz(Scanner sn, int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Escribe un numero en la posicion " + i + " " + j);
                matriz[i][j] = sn.nextInt();
            }
        }
    }  
    /**
    * Suma los valores de una determinada fila
    *
    * @param matriz
    * @param fila
    * @return
    */
    public static int sumaFila(int[][] matriz, int fila) {
        int suma = 0;
        for (int j = 0; j < matriz.length; j++) {
            suma += matriz[fila][j];
        }
        return suma;
    }
    
    public static int sumaColumna(int[][] matriz, int columna) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][columna];
        }
        return suma;
    }
    
    public static int sumaDiagonal(int[][] matriz){
        int suma=0;
        for (int i=0; i < matriz.length;i++){
            suma += matriz[i][i];
        }
        return suma;
    }
    
    public static int sumaDiagonalInversa(int[][] matriz){
        int suma=0;
        int columna=matriz.length-1;
        for (int i=0; i < matriz.length;i++){
            suma += matriz[i][columna];
            columna --;
        }
        return suma;
    }
    
    public static double mediaValores(int[][]matriz){
        double media = 0.0;
        double sumaTotal= 0.0;
        sumaTotal = sumaFila(matriz,0)+sumaFila(matriz,1)+sumaFila(matriz,2)+sumaFila(matriz,3);
        media = sumaTotal / 16;
        return media;
    }
}
    








