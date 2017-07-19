import java.util.ArrayList;

import java.util.Scanner;  

public class ResumeArrayList {

	public static void main(String[] args) throws Exception{

		String email,  name, educ = null, toExit = "exit";
		
		JDBCClass Obj = new JDBCClass();
		
		ArrayList<String> eduAchieve = new ArrayList<String>();
		ArrayList<String> experiance = new ArrayList<String>();
		ArrayList<String> skill = new ArrayList<String>();

		int counter = 0;
		int countEduc = 0;
		int countExp = 0;
		int countSkill = 0;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Name:   ");
		name = input.nextLine();
		System.out.println("Enter the email:   ");
		email = input.nextLine();
		
		/*Validate the email address*/
		while(counter !=3){
			if(!(email.contains("@") && email.contains("."))){
				System.out.println("Wrong Email please Enter email again:  ");
				email = input.nextLine();
				counter++;
			}
			else{break;}
		}
			
		System.out.println("Enter the Education and type \"exit\" to continue:   ");
			do{
				
				countExp +=1;
				if (countExp !=10){ /*To restrict a max of 10 Educational Background*/

					educ = input.nextLine();
					if(!(educ.equalsIgnoreCase(toExit))){
					eduAchieve.add(educ); /*store in the array list*/
				}
				}
			}while (!(toExit.equalsIgnoreCase(educ)));

			System.out.println("Enter the Experiance and type \"exit\" to continue:   ");
			do{
				countEduc +=1;
				if (countEduc !=10){

					educ = input.nextLine();
					if(!(educ.equalsIgnoreCase(toExit))){
					experiance.add(educ);
					}
				}
			}while (!(toExit.equalsIgnoreCase(educ)));

			System.out.println("Enter the skills and type \"exit\" :   ");
			do{
				countSkill +=1;
				if (countSkill !=20){

					educ = input.nextLine();
					if(!(educ.equalsIgnoreCase(toExit))){
					skill.add(educ);
					}
				}
			}while (!(toExit.equalsIgnoreCase(educ)));

			//Obj.prompt(name, email, eduAchieve, experiance, skill);
			AListToArray liObj = new AListToArray();
			liObj.NewPrompt(eduAchieve);
			
			input.close();
		}
	
	}
