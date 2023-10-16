package n1ejercicio1;

public class App {
	public static void main(String[] args) {
		try {
			Venta venta = new Venta();
            Producto producto1 = new Producto("Producto 1", 45.76);
            Producto producto2 = new Producto("Producto 2", 98.56);
            venta.agregarProducto(producto1);
            venta.agregarProducto(producto2);
            venta.calcularTotal();
            System.out.println("Precio total de la venta: " + venta.getPrecioTotal());
            
            Venta ventaVacia = new Venta();
            ventaVacia.calcularTotal();
        } catch (VentaVaciaException e) {
        	System.out.println(e.getMessage());
        	}
	}
	
}

