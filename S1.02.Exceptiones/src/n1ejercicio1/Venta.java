package n1ejercicio1;
import java.util.ArrayList;

public class Venta {
	private ArrayList<Producto> productos;
    private double precioTotal;

    public Venta() {
    	productos = new ArrayList<>();
        precioTotal = 0.0;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void calcularTotal() throws VentaVaciaException {
        if (productos.isEmpty()) {
            throw new VentaVaciaException();
        }
        for (Producto producto : productos) {
            precioTotal += producto.getPrecio();
        }
    }

    public double getPrecioTotal() {
        return precioTotal;
    }
}

