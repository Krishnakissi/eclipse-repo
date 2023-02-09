package com.Xworkz.Assosiation.things;

public class degree {

	
		public String name;
		public int duration;
		public boolean pursuing;
		public String branch;

		public degree() {
			System.out.println("no-arg constructor of degree");
		}

		public degree(String name, int duration, boolean pursuing, String branch) {
			this.name = name;
			this.duration = duration;
			this.pursuing = pursuing;
			this.branch = branch;
		}

		public void display() {
			System.out.println("Details of degree");
			System.out.println("degree is :" + name);
			System.out.println("Duration of degree is :" + duration);
			System.out.println("is he pursued degree :" + pursuing);
			System.out.println("branch is :" + branch);

		}
	

	}


