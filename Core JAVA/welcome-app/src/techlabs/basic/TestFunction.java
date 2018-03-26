package techlabs.basic;

public class TestFunction {
	
	public static void main(String[] args){
		printHeader();
		printHeader("x");
		printHeader("@", 100);
	}
	
	static void printHeader() {
		System.out.println("==========================");
	}
	
	static void printHeader(String inputpattern) {
		for(int c = 1;c < 30 ;c++){
			System.out.print(inputpattern);
			
		}
		System.out.println();
	}
	
	static void printHeader(String anotherpattern, int limit) {
		for (int c = 1;c < limit;c++){
			System.out.print(anotherpattern);
		}
		
	}
}
