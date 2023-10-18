package n1ejercicio1;
import java.util.ArrayList;
import java.util.List;

public class Cadenas {
	public static void main(String[] args) {
		
		List<String> cadenas = new ArrayList<>();
        cadenas.add("Jose");
        cadenas.add("Pablo");
        cadenas.add("Antonio");
        cadenas.add("Maria");
        cadenasConLetraO(cadenas);
        }
	
	static void cadenasConLetraO(List<String>cadenas) {
		cadenas.stream().filter(cadena -> cadena.contains("o") || cadena.contains("O"))
		.forEach(System.out::println); 
    } 
}

