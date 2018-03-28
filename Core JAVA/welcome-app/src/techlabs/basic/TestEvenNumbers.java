package techlabs.basic;

public class TestEvenNumbers {

	public static void main(String[] args) {

		displayingEvenNumbers(100);
		System.out.println("------------------------------------");
		displayingEvenNumbersInARange(10, 50);
		System.out.println("------------------");
		displayingEvenNumbersInARange(50, 60);
	}

	private static void displayingEvenNumbersInARange(int start, int end) {
		System.out.println("even with two parameters");
		for (int a = start; a <= end; a++) {
			if (a % 2 == 0) {
				System.out.println(a);
			}
		}

	}

	private static void displayingEvenNumbers(int start) {
		System.out.println("even with one parameters");
		for (int c = 0; c <= start; c++) {
			if (c % 2 == 0)
				System.out.println(100 - c);

		}

	}

}
