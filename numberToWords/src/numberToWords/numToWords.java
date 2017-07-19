package numberToWords;

import java.util.Scanner;

public class numToWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num,  count, remainder = 0, tohundred;
int size[] = null;
int number = 0;
Scanner input = new Scanner (System.in);
System.out.println("Enter the number from 1-10000");
num = input.nextInt();
int temp =num;
for(count = 0; num>count;++count){
	
	if (count == 1){}
	int secRemain=num%10;
	number = remainder;
	num =num / 10;
	
}
if(temp/1000 ==1){ System.out.print("One Thausand  ");// hundred
tohundred = temp%10;
number = temp%100;
temp = temp%1000;
}//Hundred
else if(temp/100 ==2){ System.out.print("Two Thausand  ");// hundred
number = temp%10;
temp = temp%100;
}//Hundred
else if(temp/100 ==3){ System.out.print("Three Thausand  ");// hundred
number = temp%10;
temp = temp%100;
}//Hundred
else if(temp/100 ==4){ System.out.print("Four Thausand  ");// hundred
number = temp%10;
temp = temp%100;
}//Hundred
else if(temp/100 ==5){ System.out.print("Five Thausand  ");// hundred
number = temp%10;
temp = temp%100;
}//Hundred
else if(temp/100 ==6){ System.out.print("Six Thausand  ");// hundred
number = temp%10;
temp = temp%100;
}//Hundred
else if(temp/100 ==7){ System.out.print("Seven Thausand  ");// hundred
number = temp%10;
temp = temp%100;
}//Hundred
else if(temp/100 ==8){ System.out.print("Eight Thausand  ");// hundred
number = temp%10;
temp = temp%100;
}//Hundred
else if(temp/100 ==9){ System.out.print("Nine Thausand  ");// hundred
number = temp%10;
temp = temp%100;
}//Hundred
								if(temp/100 ==1){ System.out.print("One hundred  ");// hundred
								number = temp%10;
								temp = temp%100;
								}//Hundred
								else if(temp/100 ==2){ System.out.print("Two hundred  ");// hundred
								number = temp%10;
								temp = temp%100;
								}//Hundred
								else if(temp/100 ==3){ System.out.print("Three hundred  ");// hundred
								number = temp%10;
								temp = temp%100;
								}//Hundred
								else if(temp/100 ==4){ System.out.print("Four hundred  ");// hundred
								number = temp%10;
								temp = temp%100;
								}//Hundred
								else if(temp/100 ==5){ System.out.print("Five hundred  ");// hundred
								number = temp%10;
								temp = temp%100;
								}//Hundred
								else if(temp/100 ==6){ System.out.print("Six hundred  ");// hundred
								number = temp%10;
								temp = temp%100;
								}//Hundred
								else if(temp/100 ==7){ System.out.print("Seven hundred  ");// hundred
								number = temp%10;
								temp = temp%100;
								}//Hundred
								else if(temp/100 ==8){ System.out.print("Eight hundred  ");// hundred
								number = temp%10;
								temp = temp%100;
								}//Hundred
								else if(temp/100 ==9){ System.out.print("Nine hundred  ");// hundred
								number = temp%10;
								temp = temp%100;
								}//Hundred

												if (count == 1){ 
													
													}
												else if (temp/10 == 2){ 
												  System.out.print("Twenty");		
													
													}
												
												else if (temp/10 == 3){ 
												  System.out.print("Thirty");		
												
													}
												else if (temp/10 == 4){ 
												  System.out.print("Fourty");		
												
													}
												else if (temp/10 == 5){ 
												  System.out.print("Fifty");		
													
													}
												else if (temp/10 == 6){ 
													
												  System.out.print("Sixty");		
												
													}
												else if (temp/10 == 7){ 
												  System.out.print("Seventy");		
												
													}
												else if (temp/10 == 8){ 
												  System.out.print("Eighty");		
													
													}
												else if (temp/10 == 9){ 
												  System.out.print("Ninty");		
												
													}//IF COUNT


if (number == 1){System.out.print(" one");}
if (number == 2){System.out.print(" two");}
if (number == 3){System.out.print(" three");}
if (number == 4){System.out.print(" four");}
if (number == 5){System.out.print(" five");}
if (number == 6){System.out.print(" six");}
if (number == 7){System.out.print(" seven");}
if (number == 8){System.out.print(" eight");}
if (number == 9){System.out.print(" nine");}
if (number == 0){System.out.print(" zero");}

}
	}


