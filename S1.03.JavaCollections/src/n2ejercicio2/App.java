package n2ejercicio2;
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;

public class App {
	public static void main(String[] args) {
		Comparator<Restaurante> comparador = Comparator
            .comparing(Restaurante::getNombre)
            .thenComparing(Restaurante::getPuntuacion, Comparator.reverseOrder());

        Set<Restaurante> restaurantes = new TreeSet<>(comparador);
		Restaurante restaurante1 = new Restaurante("Restaurante1", 5);
		Restaurante restaurante2 = new Restaurante("Restaurante2", 9);
		Restaurante restaurante3 = new Restaurante("Restaurante1", 5);
		Restaurante restaurante4 = new Restaurante("Restaurante3", 8);
		Restaurante restaurante5 = new Restaurante("Restaurante2", 4);
		restaurantes.add(restaurante1);
		restaurantes.add(restaurante2);
		restaurantes.add(restaurante3);
		restaurantes.add(restaurante4);
		restaurantes.add(restaurante5);
        
		System.out.println("Restaurantes ordenados por nombre y puntuación en orden ascendente:");
		for (Restaurante restaurante : restaurantes) {
			System.out.println(restaurante.getNombre() + " Puntuación: " + restaurante.getPuntuacion());
			}
		}
	}
	











