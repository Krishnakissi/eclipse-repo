package com.Xworkz.Assosiation.boot;

import com.Xworkz.Assosiation.things.isro.Scientist;
import com.Xworkz.Assosiation.things.isro.Isro;

public class IsroRunner {

	public static void main(String[] args) {
		Isro isro = new Isro();
		String[] locs = { "Banglore", "Delhi", "Hassan" };
		isro.setLocations(locs);

		int[] Sats = { 15, 14, 13 };
		isro.setNoOfSatellites(Sats);
		isro.display();

		Scientist scientist1 = new Scientist();

		scientist1.setName("Abdul kalam");
		scientist1.setDesignation("Director");

		Scientist scientist2 = new Scientist();

		scientist2.setName("Nambi");
		scientist2.setDesignation("Senior Scientist");
		Scientist[] scientists={scientist1,scientist2};
		isro.setScientists(scientists);
		isro.display();
	
	}

}
