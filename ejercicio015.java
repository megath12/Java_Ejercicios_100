package ejerciciosJava100;

import java.util.Scanner;

public class ejercicio015 {

	public static void main(String[] args) {
		
		Scanner en1 = new Scanner(System.in);
		Scanner en2 = new Scanner(System.in);
		
		System.out.println("Escribe una frase");
		String e1=en1.nextLine();
		
		System.out.println("Escribe otra frase");
		String e2=en2.nextLine();
		//System.out.println(e1.compareTo(e2));
		int k=e1.compareTo(e2);
		if(k>0) {
			System.out.println("La primer frase es de mayor longitud");
		}
		else if(k<0) {
			System.out.println("La segunda frase es de mayor longitud");
		}
		else {
			System.out.println("Las frases tiene la misma longitud");
		}
		en1.close();
		en2.close();
	}
}


// How to complete 2 string