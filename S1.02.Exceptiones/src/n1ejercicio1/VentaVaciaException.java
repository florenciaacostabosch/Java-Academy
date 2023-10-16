package n1ejercicio1;

public class VentaVaciaException extends Exception{
	public VentaVaciaException() {
		super("Para hacer una venta primero debes añadir productos. ");
	}
	
}

