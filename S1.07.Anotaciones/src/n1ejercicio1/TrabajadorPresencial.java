package n1ejercicio1;

public class TrabajadorPresencial extends Trabajador {
	static double precioGasolina=65;
	
	public TrabajadorPresencial(String nombre, String apellido, double precioxHora) {
		super(nombre, apellido, precioxHora);
	}
	
	 @Override
	 public double calcularSueldo(double horasTrabajadas) {
		 double sueldoBase = super.calcularSueldo(horasTrabajadas);
		 return sueldoBase + precioGasolina;
	    }
	 }
