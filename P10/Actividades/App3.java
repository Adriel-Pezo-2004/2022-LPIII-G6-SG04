
package practica10;

public class App3 {

    public static void main(String[] args) throws Exception {
        Integer[] intArray = { 1, 2, 3 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        Character[] charArray = { 'H', 'O', 'L', 'A' };

        System.out.printf("Array integerArray contiene:%n");
        imprimirArray(intArray);
        System.out.printf("%nArray doubleArray contiene:%n");
        imprimirArray(doubleArray);
        System.out.printf("%nArray charArray contiene:%n");
        imprimirArray(charArray);

        System.out.println("\n");
        System.out.printf("\ncharArray: ");
        imprimirArray(charArray, 1, 2);
        System.out.printf("%ndoubleArray: ");
        imprimirArray(doubleArray, 4, 4);
        System.out.printf("\nintegerArray: ");
        imprimirArray(intArray, 1, 1);

    }

    public static <T> void imprimirArray(T[] inputArray) {
        for (T elemento : inputArray)
            System.out.printf("%s ", elemento);
        System.out.println();

    }

    public static void validarLimites(int longitud, int limiteInferior, int limiteSuperior)
            throws LimiteInvalidoException {
        if (limiteInferior < 0 || limiteInferior > longitud || limiteSuperior < 0 || limiteSuperior > longitud
                || limiteInferior > limiteSuperior) {
            throw new LimiteInvalidoException("Fuera de límite");
        }
    }

    public static <T> void imprimirArray(T[] inputArray, int limiteInferior, int limiteSuperior) {
        int longit = inputArray.length - 1;

        try {
            validarLimites(longit, limiteInferior, limiteSuperior);
            System.out.print(limiteInferior + " - " + limiteSuperior + ": \n");
            for (int i = limiteInferior; i <= limiteSuperior; i++) {
                System.out.print(inputArray[i] + " ");
            }

        } catch (Exception e) {
            System.out.println("\n" + e.getMessage());
        }
    }

}

class LimiteInvalidoException extends IndexOutOfBoundsException {
    public LimiteInvalidoException() {
    }

    public LimiteInvalidoException(String mensajeError) {
        super(mensajeError);
    }
}