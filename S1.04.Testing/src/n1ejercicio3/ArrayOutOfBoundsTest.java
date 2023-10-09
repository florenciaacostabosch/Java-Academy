package n1ejercicio3;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ArrayOutOfBoundsTest {
	
	@Test
	public void testArrayIndexOutOfBounds() {
	        ArrayOutOfBounds ejemplo = new ArrayOutOfBounds();
	        int[] arr = {1, 2, 3};
	        try {
	            int result = ejemplo.obtieneElementoIndice(arr, 5);
	            fail("Se esperaba una ArrayIndexOutOfBoundsException.");
	            } catch (ArrayIndexOutOfBoundsException e) {
	            }
	        }
	}
