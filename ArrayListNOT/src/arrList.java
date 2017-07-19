    
import java.util.*;  
    class arrList{  
     public static void main(String args[]){  
      ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
      Scanner input = new Scanner(System.in);
     System.out.println("Name");
     String name;
    String number ="exit";
     do{
      name = input.nextLine();
     list.add(name);
     
     }while (!(number.equalsIgnoreCase(name)));
      //Traversing list through Iterator 
      
      Iterator itr=list.iterator();  
      while(itr.hasNext()){  
       System.out.println(itr.next());  
      }  
     }  
    }  