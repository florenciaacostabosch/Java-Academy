package n1ejercicio2;
import java.util.ArrayList;
import java.util.List;

public class Cadenas2 {
	public static void main(String[] args) {
		
		List<String> cadenas = new ArrayList<>();
		cadenas.add("Jose");
		cadenas.add("Pablo");
		cadenas.add("Antonio");
		cadenas.add("Maria");
		cadenasConLetraOy5(cadenas);
		}
	
	static void cadenasConLetraOy5(List<String>cadenas) {
		cadenas.stream().filter(cadena -> (cadena.contains("o") || cadena.contains("O")) 
				&& cadena.length() > 5).forEach(System.out::println); 
		}
	}