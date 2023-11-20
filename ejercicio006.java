package ejerciciosJava100;

import java.util.Scanner;

public class ejercicio006 {

	public static void main(String[] args) {
		
		Scanner en = new Scanner(System.in);
		System.out.println("Escribe el primer numero");
		int n1= en.nextInt();
		System.out.println("Escribe el segundo numero");
		int n2= en.nextInt();
		System.out.println("Numero 1: "+n1+"  Numero 2: "+n2);
		int aux;
		aux=n1;
		n1=n2;
		n2=aux;
		System.out.println("Cambios ... ");
		System.out.println("Numero 1: "+n1+"  Numero 2: "+n2);
		en.close();
	}

}

// How to swap 2nd no using 3rd variable