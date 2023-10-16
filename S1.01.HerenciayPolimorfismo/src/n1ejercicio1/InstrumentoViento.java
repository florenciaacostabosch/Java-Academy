package n1ejercicio1;

public class InstrumentoViento extends Instrumento {
	
    {
        System.out.println("Se está cargando un instrumento de viento. ");
    }
    
	public InstrumentoViento(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public void tocar() {
        System.out.println("Está sonando un instrumento de viento. ");
    }
}
