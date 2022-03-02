package ejercicios;

import java.util.*;

public class Codificador {
	
	String mensaje;
	int clave;
	char [] lista;
	String cadena;

	public void cifrarDescifrar(String mensaje, int clave) {
		
		/*Scanner sc = new Scanner(System.in);
		
		System.out.println("Si quiere cifrar pulse 1\nSi quiere descifrar pulse 2.");
		int opcion = Integer.parseInt(sc.nextLine());
		
		
		switch(opcion) {
		case 1:
			for(int i = 0;i<mensaje.length();i++) {
				System.out.print(String.valueOf((char)(mensaje.charAt(i)+clave)));
			}
			
			break;
		case 2: 
			for(int i = 0;i<mensaje.length();i++) {
				System.out.print(String.valueOf((char)(mensaje.charAt(i)-clave)));
			}
			break;
		}*/
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Si quiere cifrar pulse 1\nSi quiere descifrar pulse 2.");
		int opcion = Integer.parseInt(sc.nextLine());
		
		
		switch(opcion) {
		case 1:
			lista = mensaje.toCharArray();
			cadena ="";
			for(int i = 0; i<lista.length;i++) {
				int num = lista[i]+clave;
				cadena = cadena + ((char)num);
			}
			System.out.println(cadena);

			break;
		case 2: 
			lista = mensaje.toCharArray();
			cadena ="";
			for(int i = 0; i<lista.length;i++) {
				int num = lista[i]-clave;
				cadena = cadena + ((char)num);
			}
			System.out.println(cadena);

			break;
		}
	}

}
