package ejerciciosJava100;

import java.util.Scanner;

public class ejercicio012 {
	
	public static void main(String[] args) {
		int vmin=40;
		String cal;
		Scanner en = new Scanner(System.in);
		System.out.println("Escribe tu calificación");
		int as = en.nextInt();
		if (as >= vmin) {
			if (as > 90) {
				cal="A";
			} else if(as >75) {
				cal="B";
			}else if(as > 60) {
				cal="C";
			}else {
				cal="D";
			}
			System.out.println("Has aprobado con calificacion: "+cal);
		} else {
			cal="F";
			System.out.println("No has aprobado con calificacion: "+cal);
		}
		en.close();
	}
	
}
