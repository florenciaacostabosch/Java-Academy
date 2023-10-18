package n1ejercicio8;
import java.util.stream.Collectors;

public class App {
	public static void main(String[] args) {
		String cadena = "Hola Mundo";
		String cadenaReversa= new StringBuilder(cadena)
				.reverse()
                .chars()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
		System.out.println(cadena);
		System.out.println(cadenaReversa);
		}
	}







