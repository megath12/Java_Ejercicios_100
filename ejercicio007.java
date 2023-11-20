package ejerciciosJava100;

import java.util.Scanner;

public class ejercicio007 {

	
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		System.out.println("Escribe el primer numero ");
		int n1 = ent.nextInt();
		System.out.println("Escribe el segundo numero ");
		int n2 = ent.nextInt();
		System.out.println("Primer numero: "+n1+" Segundo numero: "+n2);
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.println("Cambio de posiciones Primer numero: "+n1+" Segundo numero: "+n2);
		ent.close();
	}
	
}

// How to swap 2 no without using 3rd variable
