package ejerciciosJava100;
import java.util.Scanner;

public class ejercicio014 {
	
	public static void main(String[] args){
		Scanner esca = new Scanner(System.in);
		System.out.println("Escribe un numero entero: ");
		String n = esca.nextLine();
		double n2=Double.parseDouble(n);
		while(n2%1!=0 || n2<=0) {
			System.out.println("Escribe un numero ENTERO y POSITIVO");
			n = esca.nextLine();
			n2=Double.parseDouble(n);
		}
		int s=(int)(n2);
		if(n2>0) {
			while(n2>1) {
				s*=(n2-1);
				n2-=1;
			}
		}
		esca.close();
		System.out.println("El factorial es "+s);
	}
	
}


// Find factorial for given no 
