package n1ejercicio1;

public class InstrumentoCuerda extends Instrumento {
	
	{
        System.out.println("Se está cargando un instrumento de cuerda. ");
    }
	
    public InstrumentoCuerda(String nombre, double precio) {
    	super(nombre, precio);
    }

    @Override
    public void tocar() {
        System.out.println("Está sonando un instrumento de cuerda. ");
    }
}
