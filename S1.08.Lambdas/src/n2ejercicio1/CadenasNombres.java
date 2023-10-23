package n2ejercicio1;
import java.util.ArrayList;
import java.util.List;

public class CadenasNombres {
	public static void main(String[] args) {
		
		List<String> cadenas = new ArrayList<>();
		cadenas.add("Jose");
		cadenas.add("Pablo");
		cadenas.add("Antonio");
		cadenas.add("Maria");
		cadenas.add("Ana");
		cadenas.add("Ona");
		cadenasConLetraAy3(cadenas);
		}
	
	static void cadenasConLetraAy3(List<String>cadenas) {
		cadenas.stream().filter(cadena -> cadena.startsWith("A")
				&& cadena.length() == 3 ).forEach(System.out::println); 
		}
	}

