/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica10;

/**
 *
 * @author Usuario
 */
public class App1 {
    public static void main(String[] args) throws Exception{
        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'H', 'O', 'L', 'A'};
        Float [] floatArray = {5.75675f, 7.88f, 9.09f, 12.45f};
        Boolean [] booleanArray = {true, false, true, true};
        
        System.out.printf("Array integerArray contiene:%n");
        imprimirArray(intArray);
        
        System.out.printf("%nArray doubleArray contiene:%n");
        imprimirArray(doubleArray);
        
        System.out.printf("%nArray charArray contiene:%n");
        imprimirArray(charArray);
        
        System.out.printf("%nArray floatArray contiene:%n");
        imprimirArray(floatArray);
        
        System.out.printf("%nArray booleanArray contiene:%n");
        imprimirArray(booleanArray);
    }
    
    public static <T> void imprimirArray(T[] inputArray) {
        for(T elemento : inputArray){
            System.out.printf("%s ",elemento);
        }
        
        System.out.println();}

}