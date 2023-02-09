package com.Xworkz.Assosiation.things;

public class Doctor {
	public String name;
	public String[] specilisation;
	public double experience;

	public Doctor() {
		System.out.println("no-arg constructor of Doctor");
	}

	public Doctor(String name, double experience) {
		this.name = name;
		this.specilisation = specilisation;
		this.experience = experience;
	}

	public void setSpecilisation(String[] specilisation) {
		this.specilisation = specilisation;
	}

	public void display() {
		System.out.println("Details of Doctor");
		System.out.println(name);
		if (this.specilisation != null) {
			for (int seq = 0; seq < this.specilisation.length; seq++) {
				System.out.println("specilisation :" + this.specilisation[seq]);
			}
		} else {
			System.out.println("this.specialisation is not pointing to any memory location");
		}
		System.out.println("experience :" + experience);
	}
}
