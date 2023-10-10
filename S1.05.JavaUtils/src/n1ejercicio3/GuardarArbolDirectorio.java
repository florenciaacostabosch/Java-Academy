package n1ejercicio3;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.io.FileWriter;
import java.io.OutputStreamWriter;

public class GuardarArbolDirectorio {
	public static void main(String[] args) {
		File directorio = new File("C:\\Users\\flore\\Desktop");
		FileWriter writer = null;
		try {
			writer = new FileWriter("ArbolDirectorio.txt");
			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
				}
		guardarArbolDirectorio(directorio, 0, writer);
		}
	
	static void guardarArbolDirectorio(File directorio, int nivel, OutputStreamWriter writer) {
		if (directorio.isDirectory()) {
			try {
				writer.write("(D) " + directorio.getName() + " (Última modificación: " + obtenerFechaModificacion(directorio) + ")\n");
				} catch (Exception e) {
					System.out.println("Error: " + e.getMessage());
					}
			File[] contenido = directorio.listFiles();
			Arrays.sort(contenido);
			for (File archivo : contenido) {
				if (archivo.isDirectory()) {
					guardarArbolDirectorio(archivo, nivel + 1, writer);
					} else {
						try {
							writer.write("(F) " + archivo.getName() + " (Última modificación: " + obtenerFechaModificacion(archivo) + ")\n");
							} catch (Exception e) {
								System.out.println("Error: " + e.getMessage());
								}
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



