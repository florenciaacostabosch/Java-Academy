package n1ejercicio5;
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.*;

public class SerializarObjeto implements Serializable {
	public static void main(String[] args) {
        Objeto objeto = new Objeto("Juan", 25);
        serializar(objeto);
        deserializar(objeto);
	}
    
	static void serializar(Objeto objeto) {
		try{
			FileOutputStream archivo = new FileOutputStream("objeto.ser");
        	ObjectOutputStream salida = new ObjectOutputStream(archivo);
        	salida.writeObject(objeto);
        	salida.close();
        	archivo.close();
        	System.out.println("Datos guardados en objeto.ser");
        	}
		catch (IOException i){
			i.printStackTrace();
		}
	}
	
	
	static void deserializar (Objeto objeto) {
		try{
			FileInputStream archivo = new FileInputStream("objeto.ser");
			ObjectInputStream entrada = new ObjectInputStream(archivo);
			objeto = (Objeto) entrada.readObject();
			entrada.close();
			archivo.close();
			}
		catch(IOException i){
			i.printStackTrace();
			}
		catch(ClassNotFoundException c){
			System.out.println("Clase Objeto no encontrada");
			c.printStackTrace();
			}
		System.out.println("Objeto deserializado. ");
		}
	}
	
	

		
