package n2ejercicio2;
import java.util.Objects;

public class Restaurante implements Comparable<Restaurante> {
    private String nombre;
    private int puntuacion;

    public Restaurante(String nombre, int puntuacion) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }
    
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurante that = (Restaurante) o;
        return puntuacion == that.puntuacion && Objects.equals(nombre, that.nombre);
    }

    public int hashCode() {
        return Objects.hash(nombre, puntuacion);
    }
    
    public int compareTo(Restaurante otroRestaurante) {
        int comparacionPorNombre = this.nombre.compareTo(otroRestaurante.nombre);
        if (comparacionPorNombre != 0) {
            return comparacionPorNombre;
        }
        return Integer.compare(this.puntuacion, otroRestaurante.puntuacion);
    }
}