package n1ejercicio1;
import java.io.File;
import java.util.Arrays;

public class ListarDirectorio {
	public static void main(String[] args) {
		File directorio = new File("C:\\Users\\flore\\Documents");
		listarDirectorio(directorio);
		}
	
	static void listarDirectorio(File directorio) {                              
		String[] lista = directorio.list();
		Arrays.sort(lista);
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
			}
		}
}

