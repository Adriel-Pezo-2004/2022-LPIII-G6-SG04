/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica10;

/**
 *
 * @author Usuario
 */
public class App2 {
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
        minimo(1,2,3,4);
        minimo(5.11, 1.11, 3.33, 9.0);
        minimo("a", "b", "c", "d");
    }
    public static void imprimirArray(Object[] inputArray) {
        for(Object elemento : inputArray)
        System.out.printf("%s ",elemento);

        System.out.println();
    }
    public static Comparable maximo(Comparable x, Comparable y, Comparable z){
        Comparable max = x;
          if(y.compareTo(x) > 0)
        max = y;
        if(z.compareTo(y) > 0)
        max = z;
        System.out.println(max);
        return max;
    }

    public static Comparable minimo(Comparable x, Comparable y, Comparable z, Comparable q){
        Comparable min = x;
          if(y.compareTo(x) < 0)
        min = y;
        if(z.compareTo(y) < 0)
        min = z;
        if(q.compareTo(z) < 0)
        min = q;
        System.out.println(min);
    return min;
    }
}
