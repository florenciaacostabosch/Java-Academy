package n1ejercicio2;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class ListarArbolDirectorio {
	public static void main(String[] args) {
		File directorio = new File("C:\\Users\\flore\\Desktop");
		listarArbolDirectorio(directorio, 0);
    }
	
    static void listarArbolDirectorio(File directorio, int nivel) {
    	if (directorio.isDirectory()) {
    		System.out.println("(D) " + directorio.getName() + " (Última modificación: " + obtenerFechaModificacion(directorio) + ")");
            File[] contenido = directorio.listFiles();
            Arrays.sort(contenido);
            for (File archivo : contenido) {
            	if (archivo.isDirectory()) {
            		listarArbolDirectorio(archivo, nivel + 1);
            		} else {
            			System.out.println("(F) " + archivo.getName() + " (Última modificación: " + obtenerFechaModificacion(archivo) + ")");
            			}
            	}
            }
    	}
    
    static String obtenerFechaModificacion(File archivo) {
    	SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    	Date fecha = new Date(archivo.lastModified());
        return formato.format(fecha);
    }

}

















