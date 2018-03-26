package techlabs.basic;

public class TestVariable {


	public static void main(String[] args) {
		String name = "Ashay";
		int age = 22;
		double salary = 10000f;
		boolean isMale = true;
		float height = 6.1f;
		float weight = 75.5f;
		float rating = 4f;
		double hra = (salary * 0.20);
		double ta = (salary * 0.10);
		double ctc = hra + ta + salary;
		

		System.out.println("Name of person is "+ name);
		System.out.println("Age of the person is "+ age);
		System.out.println("Is this person male? "+ isMale);
		System.out.println("Person's height is "+ height + ", and weight is "+ weight);
		System.out.println("Salary = "+salary);
		System.out.println("Employee rating = "+rating);
		if(rating >= 3)
			System.out.println("Employee is good");
		if(rating < 3)
			System.out.println("Hire someone else");
		System.out.println("Total ctc = "+ctc);
		
	}

}
