package n2ejercicio1;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Properties;
import java.io.FileInputStream;

public class Parametrizar {
	public static void main(String[] args) {
		Properties prop = new Properties();
		try {
			File configFile = new File("C:\\Users\\flore\\Desktop\\config.properties");
		    if (configFile.exists()) {
		        prop.load(new FileInputStream(configFile));
		    } else {
		        System.out.println("El archivo no existe en la ubicación especificada.");
		    }
		} catch (IOException e) {
		    System.out.println("Error al cargar el archivo de configuración: " + e.getMessage());
		}

        String directorioPath = prop.getProperty("directorio_a_leer");
        String archivoResultante = prop.getProperty("archivo_resultante");

        File directorio = new File(directorioPath);
        FileWriter writer = null;
        try {
            writer = new FileWriter(archivoResultante);
            guardarArbolDirectorio(directorio, 0, writer);
            writer.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
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

