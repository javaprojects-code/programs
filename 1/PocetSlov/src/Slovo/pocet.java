package Slovo;

import java.util.StringTokenizer;

public class pocet {
	
	public static void main(String[] args) {
		String[] text = { "Tohle je zku�ebn� text. Opakuje se tu n�co. Je to pravda, nebo ne. Budou se opakovat slova. Kdo v�, jak to dopadne? " };
		 for (String vstup : text) {
			 System.out.printf(
			          "Po�et slov v �et�zci '%s' pou�it�m StringTokenizer is : %d %n",
			          vstup, spocitejSlovaPomociStringTokenizer(vstup));
		 }
	}
	
	public static int spocitejSlovaPomociStringTokenizer(String text) {
	    if (text == null || text.isEmpty()) {
	      return 0;
	    }
	    StringTokenizer tokens = new StringTokenizer(text);
	    return tokens.countTokens();
	  }
}
