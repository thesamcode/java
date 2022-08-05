package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

class Physician extends User implements HIPAACompliantUser{
//... imports class definition...
	
    // Inside class:    
    private ArrayList<String> patientNotes;
    
//    public Boolean Authorized = false;
    // TO DO: Constructor that takes an ID

    public Physician(int id) {
    	super(id);
    }
 
    //  TO DO: Implement HIPAACompliantUser!
    
	@Override
	public boolean assignPin(int pin) {
		String strPin = Integer.toString(pin);
		if (strPin.length()!=4) {
		// TODO Auto-generated method stub
			System.out.println("Password needs 4 digits");
			return false;
		}
		else {
			this.pin = pin;
			return true;
		}
	}

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		if (confirmedAuthID.equals(this.id)){
			return true;
		}
		// TODO Auto-generated method stub
		return false;
	}
    
    	
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }

	
    // TO DO: Setters & Getters
    
	public ArrayList<String> getPatientNotes() {
		return patientNotes;
	}

	public void setPatientNotes(ArrayList<String> patientNotes) {
		this.patientNotes = patientNotes;
	}


    
    
}
