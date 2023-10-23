package n2ejercicio2;
import java.util.List;
import java.util.stream.Collectors;

public class CadenaEnteros {
	public static void main(String[] args) {
		List<Integer> listaEnteros = List.of(10, 25, 38, 46, 51);
		convertirAStringConComas(listaEnteros);
		
	    }
	
	public static String convertirAStringConComas(List<Integer>lista) {
		String cadena = lista.stream()
				.map(numero -> (numero % 2 == 0) ? "e" + numero : "o" + numero)
				.collect(Collectors.joining(", "));
		System.out.println(cadena); 
		return cadena;
	}
}

