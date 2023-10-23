package n2ejercicio3;

public abstract class App implements Operacion {
	public static void main(String[] args) {
		
		Operacion suma = (a, b) -> a + b;
        Operacion resta = (a, b) -> a - b;
        Operacion multiplicacion = (a, b) -> a * b;
        Operacion division = (a, b) -> (b != 0) ? a / b : Float.NaN;
        System.out.println("Suma: "+realizarOperacion(suma, 5, 3));
        System.out.println("Resta: "+realizarOperacion(resta, 5, 3));
        System.out.println("Multiplicación: "+realizarOperacion(multiplicacion, 5, 3));
        System.out.println("División: "+realizarOperacion(division, 50, 2));
    }

    public static float realizarOperacion(Operacion operacion, float a, float b) {
        return operacion.operacion(a, b);
    }
}

