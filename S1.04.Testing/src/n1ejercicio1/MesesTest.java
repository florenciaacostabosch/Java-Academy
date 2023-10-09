package n1ejercicio1;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MesesTest {

	@Test
	public void test() {
		Meses meses = new Meses();
		int numPosiciones = meses.numPosicionesArray();
		Assertions.assertEquals(numPosiciones, 12);
		boolean arrayNulo= meses.arrayNulo();
		Assertions.assertTrue(true);
		String posicionAgosto = meses.posicionMes(7);
		Assertions.assertEquals("Agosto", posicionAgosto);
	}
}
