package n1ejercicio2;
import java.util.ArrayList;
import java.util.Iterator;

public class App {
	public static void main(String[] args) {

		ArrayList<Integer> listInteger = new ArrayList<Integer>();
		
		listInteger.add(25);
		listInteger.add(3);
		listInteger.add(6);
		listInteger.add(1);
		
		ArrayList<Integer> listInteger2 = new ArrayList<Integer>();
		
		listInteger2.add(1);
		listInteger2.add(6);
		listInteger2.add(3);
		listInteger2.add(25);
		
		//iterador para el hashSet
	    Iterator<Integer> iterator = listInteger.iterator();
	    
	   //recorrer el HashSet con iterador y agregar los elementos de la segunda lista
	    while (iterator.hasNext()) {
	        Integer elementoInt = iterator.next();
	        System.out.println(elementoInt);
	        listInteger2.add(elementoInt);
	        }
	    
	    System.out.println("Lista completa: " + listInteger2);
	}
}
