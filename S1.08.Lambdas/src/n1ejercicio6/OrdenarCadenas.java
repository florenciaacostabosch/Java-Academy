package n1ejercicio6;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OrdenarCadenas {
	public static void main(String[] args) {
		List<Object> lista = Arrays.asList(5, "Juan", 56, "Maria", "Antonio", 900);
        List<Object> listaOrdenada = lista.stream()
        		.sorted((o1, o2) -> {
        			String str1 = o1.toString();
                    String str2 = o2.toString();
                    return Integer.compare(str1.length(), str2.length());
                    }).collect(Collectors.toList());
        listaOrdenada.forEach(System.out::println);
        }
	}





