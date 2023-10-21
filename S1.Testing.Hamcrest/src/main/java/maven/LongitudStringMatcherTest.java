package maven;
import org.hamcrest.core.IsEqual;
import org.junit.Test;
import org.hamcrest.Matcher;
import static org.hamcrest.MatcherAssert.assertThat;

public class LongitudStringMatcherTest {

	public static Matcher<String> hasLength(int longitud) {
        return new StringLengthMatcher(IsEqual.equalTo(longitud));
    }
	
    @Test
    public void LongitudStringTest() {
        String cadena = "Mordor";
        assertThat(cadena, hasLength(8));
    }
}

