/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Usuario
 */
public class OrderedPair<K,V> implements Pair<K,V> {
	private K key;
	private V value;
	
	public OrderedPair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public K getKey() {
		return this.key;
	}
	 
	public V getValue() {
		return this.value;
	}

	@Override
	public String toString() {
		return "\tKey: " + this.key + 
				"\tValue: " + this.value+"\n";
	}
	
}
