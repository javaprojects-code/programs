package Hra;

import java.util.ArrayList;

public class Mapa {
	 static ArrayList<Auto> auta = new ArrayList<>(); 
	
public static void main(String[] args) {
	
	 auta.add(new Auto("Audi", "49.188400337, 16.578254291"));
	 auta.add(new Auto("Ferari", "49.188400338, 16.578254391"));
	 auta.add(new Auto("Toyota", "49.188450337, 16.578256291"));
	 auta.add(new Auto("Mazda", "49.188400347, 16.578254791"));
	 
	 }
    public void VypisAuta() {
    	for (int i = 0; i < auta.size(); i++) {
			System.out.println(""+ auta.get(i).getJmeno() + auta.get(i).getSouradniceNaMape() );
		}
    }



}

