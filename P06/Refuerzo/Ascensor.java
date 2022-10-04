/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elevador;

/**
 *
 * @author Victus
 */
/**
 * Simula el desplazamiento de un ascensor que puede viajar desde el piso 1
 * hasta el piso final que se indique mediante el constructor.<br>Cuenta con
 * una limitación de peso de 750Kg.<br>Para realizar el desplazamiento hay que
 * indicar la cantidad de personas que se suben y el piso destino. La cantidad de
 * personas se usa para calcular el peso ha desplazar (considerando que cada persona
 * pesa 50kg).<br>
 * El método para desplazar lanzará distintas excepciones según si se ha superado el peso
 * máximo, si el piso destino está fuera de rango o si el ascensor ya se encuentra actualmente
 * en el piso indicado como destino.
 * @author Kabuto
 */
public class Ascensor {
 
	private final int maxPeso = 750;
	public int pisoFinal;
	public int pisoActual;
 
	public Ascensor(int pisoFinal) {
		this.pisoFinal = pisoFinal;
		pisoActual = 1; //Ascensor comienza en el 1er piso siempre
	}
 
	/**
	 * Desplaza el ascensor con la cantidad de personas indicada, al piso escogido
	 * @param personas Cantidad de personas que entran al ascensor
	 * @param pisoDestino Piso al que se desplazará el ascensor
	 * @throws Exception Habrán excepciones como el superar el peso máximo, si se ha
	 * elegido un piso fuera de rango (inexistente) o si el ascensor se encuentra en el piso deseado.
	 */
	public void subir(int personas, int pisoDestino) throws Exception {
		if (personas * 63 > maxPeso)
			throw new Exception("Peso máximo superado");
		if (pisoDestino < 1)
			throw new Exception("No existen plantas por debajo del piso 1");
		if (pisoDestino > pisoFinal)
			throw new Exception("No existen plantas por encima del piso " + pisoFinal);
		if (pisoActual == pisoDestino)
			throw new Exception("Ascensor ya se encuentra en el piso " + pisoDestino);
		//Si no ha saltado ninguna excepción, podemos desplazar el Ascensor
		pisoActual = pisoDestino;
	}
        
        public void bajar(int personas, int pisoDestino) throws Exception {
		if (personas * 63 > maxPeso)
			throw new Exception("Peso máximo superado");
		if (pisoDestino < 1)
			throw new Exception("No existen plantas por debajo del piso 1");
		if (pisoDestino > pisoFinal)
			throw new Exception("No existen plantas por encima del piso " + pisoFinal);
		if (pisoActual == pisoDestino)
			throw new Exception("Ascensor ya se encuentra en el piso " + pisoDestino);
		//Si no ha saltado ninguna excepción, podemos desplazar el Ascensor
		pisoActual = pisoDestino;
	}
	/**
	 * Informa de en cuál piso se encuentra ahora
	 * @return Piso actual
	 */
	public int getPisoActual() {
		return pisoActual;
	}
 
}
