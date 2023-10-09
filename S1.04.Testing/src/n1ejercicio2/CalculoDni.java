package n1ejercicio2;


public class CalculoDni {
	public static void main(String[] args) {
		
	}

    public static char calcularLetraDNI(int numDNI) {
    	char[] letrasDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int resto = numDNI % 23;
        return letrasDNI[resto];
        }
}