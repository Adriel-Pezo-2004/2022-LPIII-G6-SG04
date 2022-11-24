/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class Bag <T> {
	private T [] list;
	private int count; 
	
	public Bag(int n){
		this.list = (T[])new Goodies[n];
		this.count = 0;
	}
	
	public void add(T obj) throws IsFull, ExistsList{
		int buscador = getIndex(obj);
		int valor = getIndex(null);
		if (valor !=-1) {
			if(buscador == -1) {
				list[valor] = obj;
				count++;
			}
			else
				throw new ExistsList();
		}
		else 
			throw new IsFull();
	}
	
	public T[] getObjects() throws IsEmpty {
		int contAlguno = 0;
		for(int i = 0; i < list.length; i++) {
			if (list[i] != null)
				contAlguno++;
		}
		if (contAlguno !=0) {
			return (T[])list;
		}
		else {
			throw new IsEmpty();
		}
	}
	
	public T remove(T obj) throws ObjectNoExist{
		for (int i = 0; i < list.length; i++) {
			if (list[i].equals(obj)) {
				T Aux = obj;
				list[i] = null;
				count--;
				return Aux;
			}
		}
		throw new ObjectNoExist();
	}
	
	public int getIndex(T obj){
		for (int i = 0; i < list.length; i++) {
			if (list[i] == null) {
				if(obj == null)
					return i;
		    }
			else if(list[i].equals(obj)){
				return i;
			}
		}
		return -1;
	}

	
	public T[] getList() {
		return this.list;
	}

	public void setList(T[] list2) {
		this.list = list2;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "BAG"+"\nList : " + Arrays.toString(list) + "\nCount : " + count ;
	}
}
