package n1ejercicio1;

public class App {
	public static void main(String[] args) {
		
		TrabajadorOnline trabajadoronline= new TrabajadorOnline("Maria", "Gonzalez", 7.90);
		TrabajadorPresencial trabajadorpresencial= new TrabajadorPresencial("Ana", "Martinez", 9.60);
		System.out.println("Sueldo trabajador online: "+ trabajadoronline.calcularSueldo(200));
		System.out.println("Sueldo trabajador presencial: "+trabajadorpresencial.calcularSueldo(100));
        }
	}

