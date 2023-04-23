package ejerciciosJava100;

import java.util.Scanner;

public class ejercicio005 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe la temperatura en Celsius: ");
		int celsius = entrada.nextInt();
		double fahren = celsius*1.8 +32;
		double kelvin = celsius + 273.15;
		entrada.close();
		System.out.println("La temperatura es "+fahren+"° F");
		System.out.println("La temperatura es "+kelvin+" ");
	}

}
