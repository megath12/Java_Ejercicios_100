class animal{
    String nombre;
    String color;
    
    protected void ruido(){
        System.out.println("arrrrrghhhh");
    }
        
}



class gato extends animal{
    
    public static void main(String[] args){
        gato cat= new gato();
        cat.nombre="quesadillo";
        cat.color="naranja";
        cat.ruido();
        System.out.println(cat.nombre+" es mi gato ");
    }
    
}