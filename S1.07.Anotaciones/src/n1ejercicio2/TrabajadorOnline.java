package n1ejercicio2;

public class TrabajadorOnline extends Trabajador{
	protected final double precioInternet=50;

	public TrabajadorOnline(String nombre, String apellido, double precioxHora) {
		super(nombre, apellido, precioxHora);
	}
	
	@Override
    public double calcularSueldo(double horasTrabajadas) {
        double sueldoBase = super.calcularSueldo(horasTrabajadas);
        return sueldoBase + precioInternet;
    }
	
	 @Deprecated
	 public double calcularSueldoSinInternet(int horasTrabajadas) {
		 return super.calcularSueldo(horasTrabajadas);
		 }
	 }
