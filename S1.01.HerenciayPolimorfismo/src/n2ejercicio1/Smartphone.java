package n2ejercicio1;

public class Smartphone extends Telefono implements Camara, Reloj {
	public Smartphone(String marca, String modelo) {
    	super(marca, modelo);
    }
	
	public void alarma() {
		System.out.println("Está sonando la alarma. ");
		
	}

	public void fotografiar() {
		System.out.println("Se está haciendo una foto. ");
		
	}
}
