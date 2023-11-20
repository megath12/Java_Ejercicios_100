package ejerciciosJava100;

import java.util.Scanner;

public class ejercicio009 {

	public static void main(String[] args) {
		Scanner ent =new Scanner(System.in);
		System.out.println("Escribe 3 numeros:");
		int n1=ent.nextInt();
		int n2=ent.nextInt();
		int n3=ent.nextInt();
		if(n1>n2 && n1>n3) {
			System.out.println(n1+" es el numero mayor");
		}
		else if(n2>n1 && n2>n3) {
			System.out.println(n2+" es el numero mayor");
		}
		else if(n3>n1 && n3>n2) {
			System.out.println(n3+" es el numero mayor");
		}
		else {
			System.out.println("todos los numeros son iguales");
		}
		ent.close();
	}
	
}

// Find Largest no
