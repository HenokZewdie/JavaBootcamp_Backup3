import java.util.Scanner;

public class binary2Dec {
 public static void main(String[] args){
	 int bin, remain ;
	 Scanner input = new Scanner(System.in);
	 System.out.println("Enter the number:    ");
	 bin = input.nextInt();
	 double total = 0;
	
	 for(int i = 0; bin>0; i++){
		 remain = bin%10;
		 if(remain == 1 || remain == 0){
			 bin = bin/10;	
			total = total + Math.pow(2, i)*remain;
		 }
		 else{System.out.println("The number is not binary");
		 bin = 0;}
		  
	 }
	 System.out.println("Decimal   " + total);
 }
}
