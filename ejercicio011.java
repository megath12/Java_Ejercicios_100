package ejerciciosJava100;

import java.util.Scanner;

public class ejercicio011 {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		boolean t=true;
		int num;
		while(t){
			try {
				System.out.println("Escribe un numero: ");
				String g = ent.nextLine();
				num = Integer.parseInt(g);
				if (num>=18) {
					System.out.println("Eres mayor de edad");
				} else {
					System.out.println("No eres mayor de edad");
				}
				t=false;
			} catch (NumberFormatException e) {
				System.out.println("ERROR, escribe un numero, UN NUMEROOOOO");
			}
		}
		ent.close();
		System.out.println("fin");
	}
}

// If Else clause
