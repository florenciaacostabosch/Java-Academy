package n1ejercicio5;
import java.util.stream.Stream;

public abstract class App implements FunctionalInterface {
	public static void main(String[] args) {
		Stream<Double>piStream = Stream.of(3.1415);
		piStream.forEach(System.out::println);
		}
	}
