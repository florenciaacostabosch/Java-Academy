package n1ejercicio2;

public class App {
	public static void main(String[] args) {
    Coche miCoche = new Coche(100, "EcoSport");
    System.out.println("Marca: " + Coche.getMarca());
    System.out.println("Modelo: " + Coche.getModelo());
    System.out.println("Potencia: " + miCoche.getPotencia());
    Coche.frenar();
    miCoche.acelerar();
    }
}

