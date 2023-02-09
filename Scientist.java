package com.Xworkz.Assosiation.things.isro;

public class Scientist {
	public String name;
	public String designation;

	public Scientist() {
		System.out.println("created no-argument constructor of scientist");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void show() {
		System.out.println("Scientist name:"+name);
		System.out.println("Scientist designation:"+designation);
	}
	
}
