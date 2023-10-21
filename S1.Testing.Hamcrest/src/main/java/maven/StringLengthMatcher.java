package maven;
import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;

public class StringLengthMatcher extends FeatureMatcher<String, Integer> {
    public StringLengthMatcher(Matcher<? super Integer> subMatcher) {
        super(subMatcher, "una cadena de longitud", "longitud");
    }
	 
	protected Integer featureValueOf(String cadena) {
		return cadena.length();
	}
}
	
