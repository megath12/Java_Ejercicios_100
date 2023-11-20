package ejerciciosJava100;

import java.util.Scanner;

public class ejercicio013 {
	public static void main(String[] args) {
		Scanner en = new Scanner(System.in);
		System.out.println("Escribe un numero: ");
		String num = en.nextLine();
		int n = Integer.parseInt(num);
		if (n%2 == 0) {
			System.out.println("El numero "+ n +" es par");
		} else {
			System.out.println("El numero "+ n +" es impar");
		}
		en.close();
	}
}

// How to check Odd and Even Number