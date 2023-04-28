package ejerciciosJava100;

import java.math.BigInteger;
import java.util.Scanner;

public class ejercicio008 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		System.out.println("Escribe un numero ");
		String n1= ent.nextLine();
		System.out.println("Escribe otro numero ");
		String n2= ent.nextLine();
		BigInteger en1 = new BigInteger(n1);
		BigInteger en2 = new BigInteger(n1);
		BigInteger suma = en1;
		suma.add(en2);

		System.out.println("La suma es "+suma);
	}
	
}
