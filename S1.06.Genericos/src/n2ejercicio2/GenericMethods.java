package n2ejercicio2;

public class GenericMethods {
	public static <T> void metodoGenerico(String nacionalidad, T... args) {
		System.out.println("Argumento 1: " + nacionalidad);
		for (T arg : args) {
			System.out.println("Argumento: " + arg);
        }
    }
}

