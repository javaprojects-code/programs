package pr1;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String vstup= "Ahoj ahoj svete";
		String[] slova = vstup.split(" ");
		Set<String> mojeMnozina = new HashSet<>();
		
		for (String slovo : slova) {
			mojeMnozina.add(slovo);
			
		}
		System.out.println(mojeMnozina);
		
		System.out.println(mojeMnozina.size());
	}

}
