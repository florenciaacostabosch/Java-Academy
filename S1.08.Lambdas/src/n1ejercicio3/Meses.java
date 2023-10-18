package n1ejercicio3;
import java.util.Arrays;
import java.util.List;

public class Meses {
	public static void main(String[] args) {
	
		List<String> meses = Arrays.asList("Enero", "Febrero", "Marzo", "Abril", "Mayo", 
				"Junio","Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre");
		
		meses.stream().forEach(mes -> System.out.println(mes));
		}
	}
