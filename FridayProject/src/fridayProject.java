import java.util.Scanner;

public class fridayProject {
	public static void main(String[] args){
		double amount, taxAmount, taxed = 0.0, tax = 0.0;
		double Total = 0.0;
		String taxName, name, code;
		int ID;
		String answer = null;
		Scanner input = new Scanner(System.in); 
		
		
		
		do{
			System.out.println("Enter the customer ID:  ");
			ID = input.nextInt();
			input.nextLine();
			System.out.println("Enter the customer Name:  ");
			name = input.nextLine();
			System.out.println("Enter the Amount:  ");
			amount = input.nextInt();
			System.out.println("Enter the Tax ID: NRM, NPF or BIZ: ");
			taxName = input.next();
			if (taxName.equalsIgnoreCase("NRM")) {
				Total = (amount * 0.06) + amount;
				tax = 6;
				taxed = Total - amount;
				code = "NRM";
			}
			else if (taxName.equalsIgnoreCase("NPF")  ) {
				Total = (amount * 0) + amount;
				taxed = Total - amount;
				code = "NPF";
				tax = 0;
			}
			else if (taxName.equalsIgnoreCase("BIZ")) {
				Total = (amount * 0.045) + amount;
				taxed = Total - amount;
				code = "BIZ";
				tax = 4.5;
				}
			
			else {System.out.println("Enter the right tax code");
			System.out.println("Do You want to continue? Y or N");
			answer = input.nextLine();
			}
			System.out.println("Customer ID:  " + ID);
			System.out.println("Customer Name: " + name);
			System.out.println("Tax Code:  " + taxName.toUpperCase() + "   "+ tax +"%");
			System.out.println("Total Amount Due: " + Total);
			System.out.println("The taxed amount is :   " + taxed);
			
			System.out.println("Do You want to continue? Y or N");
			answer = input.next();
		}while(answer.equalsIgnoreCase("Y"));
	
		input.close();
	
	}
}

/*Customer ID: 101
Customer Name: Bart Simpson
Sales Amount: $500.00
Tax Code: NPF
Total Amount Due: $500.00

Do you want to enter another record? (Y/N)*/