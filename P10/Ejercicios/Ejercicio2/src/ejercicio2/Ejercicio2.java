
package ejercicio2;

public class Ejercicio2 {


    public static void main(String[] args) throws Exception{
        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'H', 'O', 'L', 'A'};
        Float [] floatArray = {5.75675f, 7.88f, 9.09f, 12.45f};
        Boolean [] booleanArray = {true, false, true, true};
        String[] StringArray ={"Uno","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho"};
        
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
        
        imprimirArray(StringArray);
        
        //IMPLEMENTACION EJERCICIO 2
        intercambio(StringArray, 3,7);
        
    }
    
    public static <T> void imprimirArray(T[] inputArray) {
        for(T elemento : inputArray){
            System.out.printf("%s ",elemento);
        }
        
        System.out.println();
    }

//IMPLEMENTACION EJERCICIO 2
    public static <T> void intercambio(T[] Array, int x, int y){
        T pos1,pos2;
        boolean validador = true;
        if (x >= Array.length || y >= Array.length || x < 0 || y < 0){
            System.out.printf("%nUna o las dos posiciones no existen%n");
            validador = false;
        }
        if ( x == y){
            System.out.printf("%nLas dos posiciones son iguales%n");
            validador = false;
        }
        if (validador == true){
            pos1 = Array[x];
            pos2 = Array[y];
            Array[x] = pos2;
            Array[y] = pos1;
            System.out.printf("%nArray después del intercambio:%n");
            imprimirArray(Array);
        }
    }
    
    public static void imprimirArray(String Array[]){
        int contador=1;
        int i = 0;
        int tamaño =Array.length;
        System.out.printf("%nArray de cadenas contiene:%n");
        
        for (String j : Array){
            if (contador == 4){
                System.out.printf("%-9s",j);
                System.out.printf("%n");
                contador = 1;
            }
            else {
                System.out.printf("%-9s",j);
                contador++;
            }
        }

    }
    
}
