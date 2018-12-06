package exerciseThreeMain;

import java.util.List;
import java.util.Arrays;
import java.util.Optional;

public class Strings {
	public static void main(String[] args) {
		
		List<String> joiningStrings = Arrays.asList("Hello", "Its", "Dale");
		Optional<String> words = joiningStrings.stream().reduce((str1, str2) -> str1 + " " + str2);
		words.ifPresent(System.out::print);
		
				
	}
	
	
}
