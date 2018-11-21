package ExerciseTwoMain;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class primeNumbers {
	
	public static void main(String[] args) {
		List<Integer> prime = Arrays.asList(10, 7, 3, 9, 11);
		System.out.print(prime.stream().filter(num -> isPrime(num)).sorted().collect(Collectors.toList()));
		
	}
	
	public static boolean isPrime(Integer x) {
		if (x==1) { 
			return false;
		} else {
			for(int i=2; i < x/2; i++) { 
				if(x % i == 0) {
					return false;
				}
			}
			return true;
			}
	}
}
