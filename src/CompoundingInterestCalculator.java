import java.util.Scanner;

public class CompoundingInterestCalculator {

	public static double initialInvestment;
	public static double yearlyInterestRate;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Type in your starting investment: ");
		initialInvestment = input.nextDouble();
		
		System.out.println("Type in your interest rate: ");
		yearlyInterestRate = input.nextDouble();
		
		forMethod();
		
		input.close();
	}
	
	public static void forMethod() {
		
		int year;
		
		for (year = 5; year <= 30; year += 5) {
			
			double yearResults = calculateCompoundInterest() * year;
			
			System.out.println("After " + year + " years, you would have: " + 
			yearResults);
		}
	}
	
	public static double calculateCompoundInterest() {
		
		double investment;
		
		investment = initialInvestment * (yearlyInterestRate + 1.0);
		
		return investment;
	}

}
