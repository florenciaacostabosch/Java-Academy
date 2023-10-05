package n1ejercicio3;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.io.FileWriter;

public class App {
	public static void main(String[] args) {
		HashMap<String, String> paisesyCapitales = cargaPaisesyCapitales();
        String nombreUsuario=pideNombre();
        int puntuacion = juego(paisesyCapitales);
        guardarPuntuacion(nombreUsuario, puntuacion);
        System.out.println("Juego terminado. Tu puntuación final es: " + puntuacion);
    }
	
public static String pideNombre() {
	Scanner input = new Scanner(System.in);
    System.out.print("Ingrese su nombre: ");
    String nombreUsuario = input.nextLine();
    return nombreUsuario;
}
	
public static HashMap<String, String> cargaPaisesyCapitales() {
		FileReader archivo;
		BufferedReader lector;
		//Creo HashMap
		HashMap<String, String> PaisesyCapitales = new HashMap<>();
		try {
			archivo = new FileReader("C:\\Users\\flore\\Documents\\countries.txt");
			if (archivo.ready()) {
				lector = new BufferedReader(archivo);
				String linea;
				while ((linea = lector.readLine()) != null) {
					//Separa pais y capital 
					String[] parte = linea.split(" ");
					if (parte.length == 2) {
						String pais = parte[0];
						String capital = parte[1];
						//Guarda pais y capital en el hashmap
						PaisesyCapitales.put(pais, capital);
						}
					}
				} else {
					System.out.println("El archivo no está listo para ser leído. ");
				}
			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
				}
		return PaisesyCapitales;
		}
	
public static int juego(HashMap<String, String>paisesCapitales) {
	Scanner input = new Scanner(System.in);
    int puntuacion = 0;
    Random random = new Random();
    for (int i = 0; i < 10; i++) {
        List<String> paises = new ArrayList<>(paisesCapitales.keySet());
        String paisAleatorio = paises.get(random.nextInt(paises.size()));
        String capitalCorrecta = paisesCapitales.get(paisAleatorio);
        System.out.println("Pregunta " + (i + 1) + ": ¿Cuál es la capital de " + paisAleatorio + "?");
        String respuestaUsuario = input.nextLine();
        if (respuestaUsuario.equalsIgnoreCase(capitalCorrecta)) {
            System.out.println("¡Correcto! Has ganado un punto.");
            puntuacion++;
        } else {
            System.out.println("Incorrecto. La respuesta correcta es: " + capitalCorrecta);
        }
        }
    return puntuacion;
}

public static void guardarPuntuacion(String nombreUsuario, int puntuacion) {
    try (FileWriter writer = new FileWriter("clasificacion.txt", true)) {
        writer.write(nombreUsuario + ": " + puntuacion + " puntos\n");
        System.out.println("Puntuación guardada correctamente.");
        } catch (Exception e) {
        	System.out.println("Error al guardar la puntuación: " + e.getMessage());
    }
}
}


