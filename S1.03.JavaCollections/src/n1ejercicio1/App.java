package n1ejercicio1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class App {
	public static void main(String[] args) {

	ArrayList<String> month = new ArrayList<String>();
	
	//añadir 11 meses sin agosto
	month.add("Enero");
	month.add("Febrero");
	month.add("Marzo");
	month.add("Abril");
	month.add("Mayo");
	month.add("Junio");
	month.add("Julio");
	month.add("Septiembre");
	month.add("Octubre");
	month.add("Noviembre");
	month.add("Diciembre");
	
	//añadir agosto en la posición correspondiente
	month.add(7, "Agosto");
	
	//demostrar arraylist mantiene orden correcto
	System.out.println(month);
	
	//convertir arraylist en hashSet
	HashSet<String>hashSetMonth = new HashSet<>(month);
	System.out.println(hashSetMonth);
	
	//recorrer hashset con for
	for (String elemento : hashSetMonth) {
		System.out.println(elemento);
		}
	
	//iterador para el hashSet
    Iterator<String> iterator = hashSetMonth.iterator();

    //recorrer el HashSet con iterador
    while (iterator.hasNext()) {
        String elementoMonth = iterator.next();
        System.out.println(elementoMonth);
        }
	}
}

