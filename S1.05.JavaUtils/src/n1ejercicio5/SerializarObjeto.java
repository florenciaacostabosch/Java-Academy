package n1ejercicio5;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class SerializarObjeto implements Serializable {
    private int numero;
    private String cadena;
	
    public SerializarObjeto(int numero, String cadena) {
    	this.numero = numero;
        this.cadena = cadena;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }
    
public static void main(String[] args) {
    SerializarObjeto objeto = new SerializarObjeto(25, "Hola");
	
}
	static void serializar(SerializarObjeto objeto) {
		try (FileOutputStream archivoSalida = new FileOutputStream("miobjeto.ser");
				ObjectOutputStream objetoSalida = new ObjectOutputStream(archivoSalida)) {
			objetoSalida.writeObject(objeto);
			System.out.println("Objeto serializado y guardado en miobjeto.ser");
			} catch (Exception e) {
				System.out.println("Error al leer el archivo: " + e.getMessage());
       }
	}
	
	static void deserializacion(SerializarObjeto objeto){
		try (FileInputStream archivoEntrada = new FileInputStream("miobjeto.ser");
		ObjectInputStream objetoEntrada = new ObjectInputStream(archivoEntrada)) {
			SerializarObjeto miObjeto = (SerializarObjeto) objetoEntrada.readObject();
			System.out.println("Objeto deserializado: Numero=" + objeto.getNumero() + ", Cadena=" + objeto.getCadena());
			} catch (Exception e) {
				System.out.println("Error al leer el archivo: " + e.getMessage());
			}
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
