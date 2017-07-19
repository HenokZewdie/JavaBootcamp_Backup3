import java.util.Scanner;
 
public class Division {
  public static void main(String[] args) {
 
  int a, b, result = 0;
 
  Scanner input = new Scanner(System.in);
  System.out.println("Input two integers");
 try{
  a = input.nextInt();
  b = input.nextInt();
 
  result = a / b;
 }catch(ArithmeticException ae){System.out.println("The number cant divided by zero");}
  System.out.println("Result = " + result);
  }
}