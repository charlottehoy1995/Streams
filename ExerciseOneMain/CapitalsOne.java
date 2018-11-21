package ExerciseOneMain;

import java.util.List;
import java.util.Arrays;

public class CapitalsOne {

	public static void main(String[] args) {
		List<String> capitals = Arrays.asList("Hello", "Its", "Dale");
		
		capitals.stream().map(word -> word.toUpperCase()).
		forEach(word -> System.out.print(word + " "));
		
	}
}
