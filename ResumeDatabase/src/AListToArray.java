import java.util.ArrayList;

public class AListToArray {

	public  void NewPrompt(ArrayList<String> Euc) {
	
		String[] stockArr = new String[Euc.size()];
		stockArr = Euc.toArray(stockArr);

		for(String s : stockArr)
		    System.out.println(s);

	}

}
