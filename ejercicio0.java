package ejerciciosJava100;

public class ejercicio0 {

	
		public static int factorial(int n){
		    if(n>=2){
		        return n*factorial(n-1);
		    }
		    else{
		        return 1;
		    }
		}

	    public static void main(String[] args) {
	        System.out.println(factorial(5));
	    }
}

