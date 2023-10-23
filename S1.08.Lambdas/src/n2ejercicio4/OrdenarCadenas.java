package n2ejercicio4;
import java.util.ArrayList;
import java.util.List;

public class OrdenarCadenas {
	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();
		lista.add("Juana");
	    lista.add("Maria");
	    lista.add("Carlos");
	    lista.add("Elena");
	    lista.add("123");
	    lista.add("90");
	    lista.add("46");
	    
	    System.out.println("Ordenadas alfabéticamente: ");
	    lista.stream()
	    .sorted((a, b) -> Character.compare(a.charAt(0), b.charAt(0)))
	    .forEach(System.out::println);
	    
	    System.out.println("Ordenadas alfabéticamente las que contienen letra E primero: ");
        lista.sort((a, b) -> {
        	if (a.contains("e") && !b.contains("e")) {
        		return -1;
            } else if (!a.contains("e") && b.contains("e")) {
                return 1;
            }
        	return a.compareTo(b);});
        lista.forEach(System.out::println);
    
	    System.out.println("Modificada letra A por número 4: ");
	    lista.replaceAll(cadena -> cadena.replace("a", "4"));
	    lista.forEach(System.out::println);

	    System.out.println("Sólo cadenas de números: ");
	    lista.stream()
	    .filter(cadena -> cadena.matches("-?\\d+(\\.\\d+)?"))
	    .forEach(System.out::println);
	    }
	}

