import java.util.*;

class TaxCalc{
	static double calculate(double amount)
	{
		if(amount<=200000)
			return 0;
		else if(amount<=300000)
			return 0.1*(amount-200000);
		else if(amount<=500000)
			return (0.2*(amount-300000))+10000;
		else if(amount<=1000000)
			return(0.3*(amount-500000))+50000;
		
			return (0.4*(amount-1000000))+200000;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double amount;
		System.out.print("Enter the amount: ");
		amount = sc.nextDouble();
		double tax = TaxCalculate.calculate(amount);
		System.out.println("Tax Calculated: " + tax + "\nFinal Amount: " + (amount - tax));
	}
}