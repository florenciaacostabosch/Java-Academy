package n1ejercicio1;
import java.util.ArrayList;

public class Meses {
	
	private ArrayList<String>meses;
	
	public Meses() {
		meses=new ArrayList<>();
		meses.add("Enero");
		meses.add("Febrero");
		meses.add("Marzo");
		meses.add("Abril");
		meses.add("Mayo");
		meses.add("Junio");
		meses.add("Julio");
		meses.add("Agosto");
		meses.add("Septiembre");
		meses.add("Octubre");
		meses.add("Noviembre");
		meses.add("Diciembre");	
	}
	
	public int numPosicionesArray() {
		int numPosiciones = meses.size();
		return numPosiciones;
		}
	
	public boolean arrayNulo () {
		 if (meses.isEmpty()) {
		 } return false;
		 }
	
	public String posicionMes(int posicion) {
		return meses.get(posicion);
}
}

