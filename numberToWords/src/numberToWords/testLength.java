package numberToWords;

import java.util.Arrays;
import java.util.Scanner;

public class testLength {
public static void main(String[] args){
	System.out.println("Enter number");
	Scanner input = new Scanner(System.in);

	int number = input.nextInt();
	
	int size[] = null;
	for(int i = 0; i<3; i++){
		size[i]=number%10;
	}
	System.out.println(Arrays.toString(size));
}
}
