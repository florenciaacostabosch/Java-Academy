package n1ejercicio2;

public class App {
	public static void main(String[] args) {
		
		Persona persona1 = new Persona("Marta", "Sanchez", 15);
        Persona persona2 = new Persona("Ana", "Gonzalez", 67);
        Persona persona3 = new Persona("Juan", "Martinez", 80);
        GenericMethods.metodoGenerico(persona1, persona2, persona3);
        
        String cadena = "Hola";
        Integer entero = 8;
        Double decimal = 1.05;
        GenericMethods.metodoGenerico(cadena, entero, decimal);
	}
}
