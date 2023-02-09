package com.Xworkz.Assosiation.boot;

import com.Xworkz.Assosiation.things.Engineer;
import com.Xworkz.Assosiation.things.degree;

public class EngineerRunner {

	public static void main(String[] args) {
		Engineer engineer = new Engineer("Krishna kumar", 50000D);

		String[] ref = { "Sketchup", "lumion", "Java", "Auto cadd" };
		engineer.setSkills(ref);

		degree degree = new degree("Enginner", 4, true, "Civil");
		degree degree1 = new degree("MBA", 3, true, "HR");
		
		degree[] ref1 = { degree, degree1 };
		engineer.setDegree(ref1);
		engineer.displayDetails();

	}

}
