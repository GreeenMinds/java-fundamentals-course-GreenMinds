//Scanner
import java.util.Scanner;

//Clases
class Mascota{
    //Atributos
    String nombre;
    String tipo;
    
    //Métodos
    public void jugar(){
        System.out.println(nombre + " el " + tipo + " esta jugando felizmente por el bosque");
    }
}

public class Main
{
    
    //Métodos
  
    //1. Sin parametros
    
    public static void saludar(){
        System.out.println("Hola como estas");
    }
    
    //2. Con parametros
    
    public static void saludar(String nombre){
        System.out.println("Hola como estas " + nombre);
    }
    
	public static void main(String[] args) {
	    
	  //LLamado de metodos
	    
	  saludar();
	  saludar("Pepe");
	    
	  //Creacion Scanner
	    
	  Scanner lector = new Scanner(System.in);
	    
	  System.out.println("Como te llamas?");
	  String nombre = lector.nextLine();
	    
	  saludar(nombre);
	    
	  //Uso de Clases
		Mascota mascota1 = new Mascota();
		Mascota mascota2 = new Mascota();
		
	  System.out.println("Como se llama tu mascota 1?");
		mascota1.nombre = lector.nextLine();
	  System.out.println("Como animal es?");
		mascota1.tipo = lector.nextLine();
		
    System.out.println("Como se llama tu mascota 2?");
		mascota2.nombre = lector.nextLine();
    System.out.println("Como animal es?");
		mascota2.tipo = lector.nextLine();
		
		mascota1.jugar();
		mascota2.jugar();
		
		//Cerrar Scanner
		lector.Close();
	}
}
