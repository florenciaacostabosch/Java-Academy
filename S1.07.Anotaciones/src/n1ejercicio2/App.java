package n1ejercicio2;

public class App {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		TrabajadorOnline trabajadoronline= new TrabajadorOnline("Maria", "Gonzalez", 7.90);
		TrabajadorPresencial trabajadorpresencial= new TrabajadorPresencial("Ana", "Martinez", 9.60);
	    System.out.println("Sueldo trabajador presencial obsoleto: " + trabajadoronline.calcularSueldoSinInternet(200));
	    System.out.println("Sueldo trabajador online obsoleto: " + trabajadorpresencial.calcularSueldoSinGasolina(100));
	    }
	}

