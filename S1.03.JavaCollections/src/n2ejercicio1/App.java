package n2ejercicio1;
import java.util.HashSet;
import java.util.Set;

public class App {
	 public static void main(String[] args) {
		 
		 Set<Restaurante> restaurantes = new HashSet<>();
		 Restaurante restaurante1 = new Restaurante("Restaurante1", 5);
	     Restaurante restaurante2 = new Restaurante("Restaurante2", 9);
	     Restaurante restaurante3 = new Restaurante("Restaurante1", 5); 
	     Restaurante restaurante4 = new Restaurante("Restaurante3", 8); 
	     restaurantes.add(restaurante1);
	     restaurantes.add(restaurante2);
	     restaurantes.add(restaurante3); 
	     System.out.println("Restaurantes: ");
	     for (Restaurante restaurante : restaurantes) {
	    	 System.out.println(restaurante.getNombre() + " Puntuación: " + restaurante.getPuntuacion());
	    	 }
	     }
	 }




