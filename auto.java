package ejerciciosJava100;

public class auto {
        String color;
        int velMax;			// atributos
        String modelo;			
        public void correr(){   // metodos
            System.out.println("Fiuuuuuuum, esto llega a "+velMax);
        }
        public void arranque(){
            System.out.println("iniciando modelo "+modelo + " ... ");
        }

    public static void main(String[] args) {
        auto ferrari = new auto();	// instancia de objeto
        ferrari.color="rojo";
        ferrari.modelo="X"; 
        ferrari.velMax=334;
        //System.out.println(ferrari.velMax);
        ferrari.arranque();
        ferrari.correr();
        //System.out.println(ferrari.arranque());
    }
}
