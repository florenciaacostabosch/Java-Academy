package n1ejercicio1;

public class InstrumentoPercusion extends Instrumento {
	
	{
        System.out.println("Se está cargando un instrumento de percusión. ");
    }
	
    public InstrumentoPercusion(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public void tocar() {
        System.out.println("Está sonando un instrumento de percusión. ");
    }
}
