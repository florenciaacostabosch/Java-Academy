package n1ejercicio4;
import java.util.Arrays;
import java.util.List;

public class Meses2 {
	public static void main(String[] args) {
		
		List<String> meses = Arrays.asList("Enero", "Febrero", "Marzo", "Abril", "Mayo", 
				"Junio","Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre");
		
		meses.stream().forEach(System.out::println);
		}
	}