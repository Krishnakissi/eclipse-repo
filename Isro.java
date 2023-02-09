package com.Xworkz.Assosiation.things.isro;

public class Isro {
	public String[] locations;
	public int[] noOfSatellites;
	public Scientist[] scientists;

	public Isro() {
		System.out.println("created no-argument constructor of Isro");
	}

	public void setLocations(String[] locations) {
		this.locations = locations;
	}

	public void setNoOfSatellites(int[] noOfSatellites) {
		this.noOfSatellites = noOfSatellites;
	}

	public void setScientists(Scientist[] scientists) {
		this.scientists = scientists;
	}

	public void display() {
		if (this.locations != null) {
			for (int num = 0; num < this.locations.length; num++) {
				String element = this.locations[num];
				System.out.println(element);
			}
		} else {
			System.out.println("not pointing to any memory");
		}

		if (this.noOfSatellites != null) {
			for (int seq = 0; seq < this.noOfSatellites.length; seq++) {
				int element = this.noOfSatellites[seq];
				System.out.println(element);
			}
		} else {
			System.out.println("not pointing to any memory");
		}

		if (this.scientists!=null) {
			for (int seq=0;seq<this.scientists.length;seq++) {
				Scientist element = this.scientists[seq];
				System.out.println("scientists at index:"+seq);
				element.show();
			}
		}
	}

}
