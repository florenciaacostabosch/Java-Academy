package n1ejercicio5;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializarObjeto implements Serializable {
	public static void main(String[] args) {
        // Serializar un objeto
        Objeto objeto = new Objeto("Juan", 25);
        try {
        	FileOutputStream archivoSalida = new FileOutputStream("objeto.ser");
            ObjectOutputStream salidaObjeto = new ObjectOutputStream(archivoSalida);
            salidaObjeto.writeObject(objeto);
            salidaObjeto.close();
            archivoSalida.close();
            System.out.println("Objeto serializado en objeto.ser");
            } catch (Exception e) {
            	System.out.println("Error al leer el archivo: " + e.getMessage());
            	}
        
        // Deserializar un objeto
        Objeto objetoDeserializado = null;
        try {
            FileInputStream archivoEntrada = new FileInputStream("miobjeto.ser");
            ObjectInputStream entradaObjeto = new ObjectInputStream(archivoEntrada);
            objetoDeserializado = (Objeto) entradaObjeto.readObject();
            entradaObjeto.close();
            archivoEntrada.close();
            System.out.println("Objeto deserializado desde miobjeto.ser");
            } catch (Exception e) {
        	System.out.println("Error al leer el archivo: " + e.getMessage());
        	} 
        }
}
		
