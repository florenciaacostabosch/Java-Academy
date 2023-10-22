package n2ejercicio1;

public class GenericMethods {
	public static <T> void metodoGenerico(String nacionalidad, T arg2, T arg3) {
        System.out.println("Argumento 1: " + nacionalidad);
        System.out.println("Argumento 2: " + arg2);
        System.out.println("Argumento 3: " + arg3);
    }
}
