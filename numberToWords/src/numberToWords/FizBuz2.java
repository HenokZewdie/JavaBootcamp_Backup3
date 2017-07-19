package numberToWords;
public class FizBuz2 {
public static void main(String[] args){
	
	
	int number = 100;
	String output[] = {"Fiz", "buzz", "FizzBuz"};
	
	for(int i = 1; i<=100; i++){
	if(i % 3 ==0 && i %5 == 0){
		
		System.out.println( output[0]);}
	
		else if (i % 3 ==0){System.out.println( output[1]);}
		else if (i %5 == 0){System.out.println( output[2]);}
		else{System.out.println(i);}
	}
}


}