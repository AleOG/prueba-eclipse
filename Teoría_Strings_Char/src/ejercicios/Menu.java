package ejercicios;

import java.util.*;

public class Menu {

	public static void main(String[] args) {
		Codificador cod = new Codificador();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el mensaje.");
		
		String mensaje = sc.nextLine();
		
		System.out.println("Introduce la clave para descifrar.");
		
		int clave = Integer.parseInt(sc.nextLine());
		
		cod.cifrarDescifrar(mensaje, clave);

	}

}
