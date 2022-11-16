/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica10;

/**
 *
 * @author Usuario
 */
public class Ejercicio3 {
    
    public static void main(String[] args) throws Exception{
        Integer[] intArray = {1, 2, 3};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'H', 'O', 'L', 'A'};
        System.out.printf("Array integerArray contiene:%n");
        imprimirArray(intArray);
        System.out.printf("%nArray doubleArray contiene:%n");
        imprimirArray(doubleArray);
        System.out.printf("%nArray charArray contiene:%n");
        imprimirArray(charArray);
            System.out.println("\n");
           

        isEqualsTo(1,2);
        isEqualsTo(4.44,4.44);
        isEqualsTo("a","a");
        isEqualsTo(true , true);

        

        
        
    }
    
    private int x;

    public Ejercicio3(int x) {
        this.x = x;
    }
    
    
    
    
    public static void imprimirArray(Object[] inputArray) {
        for(Object elemento : inputArray)
        System.out.printf("%s ",elemento);

        System.out.println();
    }
    
    public static Comparable isEqualsTo(Comparable x, Comparable y){
        Comparable z = null;
        if (x.equals(y)){
            z = true;
            System.out.println(z);
            return z;
            
        }
        else{
            z = false;
            System.out.println(z);
            return z;
        }
    }
}
