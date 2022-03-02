package ejercicios;

/*Elabora un m�todo en JAVA que invierta una cadena, p.ej: al introducir la cadena "Hola" el resultado ser� "aloH".
Debes hacer uso de los m�todos charAt() e indexOf()*/

import java.util.*;

public class Inversor_palabras {

	static String nombre;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el texto que quieras invertir.");
		nombre = sc.nextLine();
		inversor();
	}
	
	public static void inversor() {
		char[] cadena = new char[nombre.length()];
		int index=0;
		
		/*En este bucle se empieza desde la �ltima letra de la palabra o texto hasta llegar a la primera letra.
		 * Con el m�todo .indexOf() se obtendr� el �ndice que ocupa cada caracter. El valor del caracter se obtiene a partir del m�todo .charAt()
		 * Despu�s el caracter en ese indice se pasar� a una posici�n en una cadena que empieza desde indice=0 hasta indice=longitud del texto-1
		 */
		
		while(index<=nombre.length()-1) {
			int i = nombre.indexOf(nombre.charAt((nombre.length()-1)-index));
			cadena[index] = (char)nombre.charAt(i);
			index++;
		}
		System.out.println(cadena);
	}
}
