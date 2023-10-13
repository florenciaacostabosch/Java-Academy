package n1ejercicio5;
import java.io.Serializable;

	public class Objeto implements Serializable {
		private String nombre;
	    private int edad;

	    public Objeto(String nombre, int edad) {
	        this.nombre = nombre;
	        this.edad = edad;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public int getEdad() {
	        return edad;
	    }
	    
	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public void setEdad(int edad) {
	        this.edad = edad;
	    }
}
