package core;

public class PrimeNumberChecker {
	public Boolean validate(final Integer primeNumber) {
		// for (int i = 2; i < (primeNumber / 2); i++) {
		System.out.println("primeNumber - " + primeNumber);
		for (int i = 2; i < primeNumber; i++) {
			System.out.println("i - " + i);
			if (primeNumber % i == 0) {
				return false;
			}
		}
		return true;
	}
}
