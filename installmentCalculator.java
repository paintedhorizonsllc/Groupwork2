package Assignment2;
import java.util.Scanner;

public class EnergyBill {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// main: asks for customer type, calculates billAmount,
	//       prints it and the average per day, then shows the menu.
	// --------------------------------------------------------------
		System.out.print("Enter customer type: R, r (Residential) or B, b (Business):\n");
        char type = input.next().charAt(0);

        double billAmount;  // this is the ONLY bill variable we use across methods

	
	
	
        // Print amount due and average per day (30 days)
    
      
        
        System.out.println("30 Billing Days");
        System.out.printf("Average Cost per Day = $%.2f%n",  billAmount / 30.0);
        // Pass billAmount to the menu
        
	}//end main
	
	// --------------------------------------------------------------
	/* This method calculates an amount due repayment plan to be paid off in equal installments 
	 //over 30 billing days. It prompts the user for the number of the required Installment. 
	 //It presumes that the user enter a correct number of installments (2, 3, or 4), and 
	 //does not check for that. It prints to the standard output, the new amount due after 
	 //applying the required installment plan, and the amount of each installment. */
    // --------------------------------------------------------------
	
    public static void InstallmentCalculator(double billAmount) {

        System.out.print("Enter the number of the required Installment (2, 3, or 4):\n");
        int numInstallments = input.nextInt();

        double interestRate = 0.0;

        if (numInstallments == 2) {
            interestRate = 0.0535;
        } else if (numInstallments == 3) {
            interestRate = 0.055;
        } else if (numInstallments == 4) {
            interestRate = 0.0575;
        }
        // (Per assignment, assume user enters 2, 3 or 4.)

        double totalWithInterest = billAmount * (1.0 + interestRate);
        double eachInstallment = totalWithInterest / numInstallments;

      
        System.out.printf("With %d installment your bill of $%.2f will be worth $%.2f\n"),
                numInstallments, billAmount, totalWithInterest);
        System.out.printf("Each installment will be worth $%.2f\n", eachInstallment);
    }
	
	
	
	
	
	
	
	
	
	
	
	
	

}//end class

 




       
    
