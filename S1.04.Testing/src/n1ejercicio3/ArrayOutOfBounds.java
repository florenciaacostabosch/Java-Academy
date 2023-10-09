package n1ejercicio3;

public class ArrayOutOfBounds {
	public static void main(String[] args) {
		
	}

static int obtieneElementoIndice(int[] arr, int index) {
    try {
        return arr[index];
    } catch (ArrayIndexOutOfBoundsException e) {
        throw e;
    }
}
}
