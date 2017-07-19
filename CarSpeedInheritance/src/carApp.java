import java.util.Scanner;

public class carApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter name");
		String model = input.nextLine();
		car carObj = new car(model, "C250", 2016, "White", "Manual", 240);
		car carOverride = new car();
		
		carOverride.setCarType("Toyota");
		carOverride.setModel("Hilander");
		carOverride.setManYear(2017);
		carOverride.setCarColor("Gray");
		carOverride.setTransmission("Automatic");
		carOverride.setMaxspeed(204);
		
		
		System.out.println(carObj.model());
		System.out.println(carOverride.model());
		System.out.println();
		System.out.println(carObj.accelerate());
		System.out.println(carOverride.accelerate());
		System.out.println();
		System.out.println(carObj.moving());
		System.out.println(carOverride.moving());
		
		input.close();
	
		
	}

}
