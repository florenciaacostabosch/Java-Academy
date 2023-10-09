package n1ejercicio2;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class CalculoDniTest {
	@Test
	void testCalcularLetraDNI() {
		int[] numerosDNI = {12345678, 84805836, 84751819, 54321678, 9876544, 98456732, 98765432, 54321678, 87654321, 34216754};
		char[] letrasEsperadas = {'Z', 'Y', 'Q', 'W', 'E', 'B', 'M', 'W', 'X', 'E'};
	}
	
	@ParameterizedTest
	@ValueSource(ints = {12345678, 84805836, 84751819, 54321678, 9876544, 98456732, 98765432, 54321678, 87654321, 34216754})
	void testCalcularLetraDNIParametrizado(int numDNI) {
		char letraCalculada = CalculoDni.calcularLetraDNI(numDNI);
// Calcular la letra esperada para cada número de DNI
		char letraEsperada = calcularLetraDNI(numDNI);
		assertEquals(letraEsperada, letraCalculada);
	    }
	
	private char calcularLetraDNI(int numDNI) {
		char[] letraDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
		int resto = numDNI % 23;
		return letraDNI[resto];
	    }
	}
