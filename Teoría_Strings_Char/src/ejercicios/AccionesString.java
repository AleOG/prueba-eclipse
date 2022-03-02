package ejercicios;

import java.util.*;

public class AccionesString {

	public static void main(String[] args) {
		boolean terminar= false;
		String texto;
		Scanner sc = new Scanner(System.in);
		
		//Men� para el usuario.
		do {
			System.out.println("Elija el n�mero de la funci�n que quiere ejecutar:"
					+ "\n\t1.Eliminar las tildes del texto."
					+ "\n\t2.Sustituir los espacios en el texto por puntos y coma."
					+ "\n\t3.Convertir todo el texto a min�sculas."
					+ "\n\t4.Eliminar los espacios sobrantes en el texto."
					+ "\n\t5.Salir.");
			int eleccion = Integer.parseInt(sc.nextLine());
			
			//Selecci�n y aplicaci�n de los m�todos.
			switch(eleccion) {
			case 1:
				System.out.println("Escribe el texto.");
				texto = sc.nextLine();
				System.out.println(noTilde(texto));
				break;
			case 2:
				System.out.println("Escribe el texto.");
				texto = sc.nextLine();
				System.out.println(espacioToPuntoyComa(texto));
				break;
			case 3:
				System.out.println("Escribe el texto.");
				texto = sc.nextLine();
				System.out.println(mayusToMinus(texto));
				break;
			case 4:
				System.out.println("Escribe el texto.");
				texto = sc.nextLine();
				System.out.println(spaceReductor(texto));;
				break;
			case 5:
				terminar=true;
			}
			
		}while(terminar==false);
		
	}
	
	/*Cambiar los caracteres con tilde al mismo sin tilde (p.ej �->a)*/
	
	public static char[] noTilde(String texto) {
		
		//Se crean 2 arrays de vocales con tilde y vocales sin tilde que se emparejan en el mismo n�mero de �ndice..
		char[] tilde =new char[]{'�','�','�','�','�','�','�','�','�','�'};
		char[] sinTilde = new char[] {'a','e','i','o','u','A','E','I','O','U'};
		char[] cadena = texto.toCharArray();
		
		//En este bucle se identifican las vocales con tilde en el texto, las localiza dentro del array tilde y la sustituye por la vocal del array sinTilde en la misma posici�n.
		for(int i =0;i<cadena.length;i++) {
			for(int j = 0;j<tilde.length;j++) {
				if(cadena[i]==tilde[j]) {
					cadena[i]=sinTilde[j];
				}
			}
		}
		return cadena;
	}
	
	
	/*Cambiar los espacios por ; (p. ej: "hola Pedro" - > "hola;Pedro")*/
	
	//Con el m�todo replace se sustituye el caracter espacio por un punto y coma.
	public static String espacioToPuntoyComa(String texto) {
		return texto.replace(' ', ';');
	}
	
	/*Cambiar las may�sculas a min�sculas (p.ej: "HOla" -> "hola")*/
	
	//Con el m�todo toLowerCase se convierten todos los caracteres a min�sculas.
	public static String mayusToMinus(String texto) {
		return texto.toLowerCase();
	}
	
	/*Si hay m�s de un espacio entre dos palabras, cambiarlo por un �nico espacio*/
	
	public static String spaceReductor(String texto) {
		boolean hayEspacio=false;
		String cadena="";
		
		/*
		 * Dentro del bucle se recorrer� el texto. Cuando el caracter es distinto de espacio se unir� a la cadena directamente.
		 * Cuando el caracter es texto, el primero lo �nira a la cadena resultante y se indicar� que ya se ha encontrado un espacio(hayEspacio=true).
		 * Los siguientes espacios encontrados despu�s de un espacio incorporado a la cadena se obviar�n.
		 * Cuando vuelva a aparecerer un caracter distinto de cero, siguiente primer espacio se volver� a unir a la cadena y se repetira lo anterior.
		 * */
		for(int i=0; i<texto.length();i++) {
			if(texto.charAt(i)==' ') {
				if((texto.charAt(i)==' ')&&(hayEspacio==false)) {
					cadena = cadena + texto.charAt(i);
					hayEspacio=true;
				}
			}else {
				cadena = cadena + texto.charAt(i);
				hayEspacio = false;
			}
		}
		return cadena;
	}

}
