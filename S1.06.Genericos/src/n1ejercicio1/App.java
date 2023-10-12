package n1ejercicio1;

public class App {
	 public static void main(String[] args) {
	        NoGenericMethods<Integer> enteros = new NoGenericMethods<>(10, 20, 30);
	        System.out.println("Objeto 1: " + enteros.getObjeto1());
	        System.out.println("Objeto 2: " + enteros.getObjeto2());
	        System.out.println("Objeto 3: " + enteros.getObjeto3());

	        NoGenericMethods<String> cadenas = new NoGenericMethods<>("Hola", "Adiós", "Buenas tardes");
	        System.out.println("Objeto 1: " + cadenas.getObjeto1());
	        System.out.println("Objeto 2: " + cadenas.getObjeto2());
	        System.out.println("Objeto 3: " + cadenas.getObjeto3());
	        
	        NoGenericMethods<Double> decimales = new NoGenericMethods<>(10.25, 40.67, 98.45);
	        System.out.println("Objeto 1: " + decimales.getObjeto1());
	        System.out.println("Objeto 2: " + decimales.getObjeto2());
	        System.out.println("Objeto 3: " + decimales.getObjeto3());
	    }
	}