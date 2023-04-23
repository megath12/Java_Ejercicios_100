package ejerciciosJava100;

import java.util.Scanner;

public class ejercicio004 {

	public static void main(String[] args) {
		Scanner nume = new Scanner(System.in);
		System.out.println("Escribe una palabra: ");
		String palabra= nume.next();
		System.out.println("Escribe un numero: ");
		int numero = nume.nextInt();
		System.out.println("La palabra es "+palabra);
		System.out.println("El numero es "+numero);
		nume.close();
	}

}
