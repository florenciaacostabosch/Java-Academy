package n1ejercicio4;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.io.OutputStreamWriter;

public class LeerArchivo {
	public static void main(String[] args) {
		leerArchivoTxt("C:\\Users\\flore\\Documents\\countries.txt");
		
		}
	
	static void leerArchivoTxt(String nombreArchivo) {
		FileReader archivo = null;
		BufferedReader lector = null;
		try {
			archivo = new FileReader(nombreArchivo);
			lector = new BufferedReader(archivo);
			String linea;
			while ((linea = lector.readLine()) != null) {
				System.out.println(linea);
				}
			} catch (Exception e) {
				System.out.println("Error al leer el archivo: " + e.getMessage());
				}
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