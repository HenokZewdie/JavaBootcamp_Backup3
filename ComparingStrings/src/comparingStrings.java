import java.util.Scanner;

public class comparingStrings{
public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("How is the weather?");
        String answer = sc.nextLine();

        if(answer.equalsIgnoreCase("rain")){
            System.out.println("Take your umbrella!");
            }
        else if (answer.equalsIgnoreCase("windy")){
            System.out.println("Wear your jacket!");}
        else if (answer.equalsIgnoreCase("snow")){
            System.out.println("Wear a coat and take a shovel!");}
        else if(answer.equalsIgnoreCase("stormy")){
        	System.out.println("You should stay inside" );}
        else{
            System.out.println("Enjoy your day!");}
     }
}

//Add a line to print "You should stay inside" if the response is "stormy"