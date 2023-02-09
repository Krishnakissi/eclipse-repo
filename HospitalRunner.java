package com.Xworkz.Assosiation.boot;
import com.Xworkz.Assosiation.things.Hospital;
import com.Xworkz.Assosiation.things.Doctor;
public class HospitalRunner {

	public static void main(String[] args) {
		
		Hospital hospital = new Hospital();
		hospital.setName("Kanva");
		hospital.setLocation("Rajaji nagar");

		Doctor doctor = new Doctor("DR Santhosh", 35.5D);
		Doctor doctor1 = new Doctor("DR Ravi", 20.5D);
		String[] ref = { "MBBS", "MD" };
		doctor.setSpecilisation(ref);
		String[] ref1 = { "MBBS", "MD" };
		doctor1.setSpecilisation(ref1);
		Doctor[] ref2 = { doctor, doctor1 };
		hospital.setDoctor(ref2);
		hospital.display();
	}

	}


