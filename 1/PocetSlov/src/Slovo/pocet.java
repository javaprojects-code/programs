package Slovo;

import java.util.StringTokenizer;

public class pocet {
	
	public static void main(String[] args) {
		String[] text = { "Tohle je zkušební text. Opakuje se tu nìco. Je to pravda, nebo ne. Budou se opakovat slova. Kdo ví, jak to dopadne? " };
		 for (String vstup : text) {
			 System.out.printf(
			          "Poèet slov v øetìzci '%s' použitím StringTokenizer is : %d %n",
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
