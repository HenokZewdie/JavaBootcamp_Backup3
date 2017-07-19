import java.util.Scanner;

public class Mowing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int length, width, area, TotalTime;
int ConstArea = 20;
int hr, min;

Scanner input = new Scanner(System.in);
System.out.println("Enter the length: ");
length = input.nextInt();
System.out.println("Enter the width: ");
width = input.nextInt();
area = width * length;
TotalTime = area / ConstArea;
	
if (TotalTime > 60){
	min = TotalTime % 60;
	hr = (int)(TotalTime / 60);
	System.out.println("The total area is " + area);
	System.out.println("The total time is  " + hr + " hours and " + min + " minutes");
}
else {
	System.out.println("The total area is " + area);
	System.out.println("The Total minute is " + TotalTime);
	}
	}

}
