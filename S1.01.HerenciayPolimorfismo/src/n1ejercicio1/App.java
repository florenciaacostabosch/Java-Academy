package n1ejercicio1;

public class App {
	
	static {
        System.out.println("Carga de instrumentos... ");
    }

    public static void main(String[] args) {
        InstrumentoViento flauta = new InstrumentoViento("Flauta", 100.0);
        flauta.tocar();

        InstrumentoCuerda guitarra = new InstrumentoCuerda("Guitarra", 200.0);
        guitarra.tocar();

        InstrumentoPercusion tambor = new InstrumentoPercusion("Tambor", 50.0);
        tambor.tocar();
    }
}

