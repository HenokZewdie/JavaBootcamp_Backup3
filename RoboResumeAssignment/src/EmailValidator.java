import java.util.Scanner;

public class EmailValidator {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter email: ");
		String email = input.nextLine();
        int counter = 0;
		while(counter ==3){
		if(!(email.contains("@") && email.contains("."))){
			System.out.println("Wrong Email");
			System.out.println("please Enter email again: ");
			email = input.nextLine();
			counter++;
		}
		input.close();
		}
	}
}
//char c : email.toCharArray()*/