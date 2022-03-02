package ejercicios;

/*Elabora un método en JAVA que invierta una cadena, p.ej: al introducir la cadena "Hola" el resultado será "aloH".
Debes hacer uso de los métodos charAt() e indexOf()*/

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
		
		/*En este bucle se empieza desde la última letra de la palabra o texto hasta llegar a la primera letra.
		 * Con el método .indexOf() se obtendrá el índice que ocupa cada caracter. El valor del caracter se obtiene a partir del método .charAt()
		 * Después el caracter en ese indice se pasará a una posición en una cadena que empieza desde indice=0 hasta indice=longitud del texto-1
		 */
		
		while(index<=nombre.length()-1) {
			int i = nombre.indexOf(nombre.charAt((nombre.length()-1)-index));
			cadena[index] = (char)nombre.charAt(i);
			index++;
		}
		System.out.println(cadena);
	}
}
