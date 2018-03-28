package techlabs.basic;

public class TestMultiplicationwithDRY {

	public static void main(String[] args) {
		printTable(7);
		printTable(17, 13);

	}

	static void printTable(int input, int limit) {
		for (int counter = 1; counter <= limit; counter++) {
			System.out.println(input + " * " + counter + " = " + input * counter);
		}

	}

	static void printTable(int inputnumber) {
		for (int c = 1; c <= 10; c++) {
			System.out.println(inputnumber + "*" + c + " = "
					+ (inputnumber * c));

		}

	}

}
