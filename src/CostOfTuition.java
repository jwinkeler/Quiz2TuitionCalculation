import java.util.Scanner;
public class CostOfTuition {

	public static void main(String[] args) {
		int year;
		double PercentIncrease;
		double InitialTuition = 0;
		double FinalTuition = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the initial tuition cost:");
		InitialTuition = input.nextDouble();
		System.out.println("Please enter the percentage increase of tuition in the form of a decimal:");
		PercentIncrease = input.nextDouble();
		
		for (year = 0; year<4; year++){
			FinalTuition = FinalTuition + InitialTuition*Math.pow((1+PercentIncrease), year) ;
		}
		System.out.printf ("The total tuition cost for a four year degree is $%,.2f", FinalTuition);
				
		
		
		
		
		
		

	}

}
