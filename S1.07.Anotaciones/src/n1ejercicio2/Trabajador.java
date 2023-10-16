package n1ejercicio2;

public class Trabajador {
	private String nombre;
	private String apellido;
	protected double precioxHora;
	
	public Trabajador(String nombre, String apellido, double precioxHora) {
		this.nombre = nombre;
	    this.apellido = apellido;
	    this.precioxHora = precioxHora;
	    }
	
	public double calcularSueldo(double horasTrabajadas) {
		return horasTrabajadas*precioxHora;
	}
}

