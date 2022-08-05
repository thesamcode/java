
package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin{

//... imports class definition...
    
    // Inside class:
    private Integer employeeID;
    private String role;
    //      this is saying the variable is an array list type and this side is is now saying I am creating an array list itself
    private ArrayList<String> securityIncidents = new ArrayList<String>();
    
    // private String go = new String();
    
    // TO DO: Implement a constructor that takes an ID and a role
    public AdminUser(Integer id, String role) {
		super(id);
		this.role = role;
	}
    
    // TO DO: Implement HIPAACompliantUser!
	@Override
	public boolean assignPin(int pin) {
		String strPin = Integer.toString(pin);
		if (strPin.length()!=6) {
		// TODO Auto-generated method stub
			System.out.println("Password needs 6 digits");
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
		this.authIncident();
		return false;
	}
    
    
	
	public ArrayList<String> reportSecurityIncidents(){
		
		return securityIncidents;
	}
    
    // TO DO: Implement HIPAACompliantAdmin!
    
    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }

	public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }
	
    // TO DO: Setters & Getters

	public Integer getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public ArrayList<String> getSecurityIncidents() {
		return securityIncidents;
	}

	public void setSecurityIncidents(ArrayList<String> securityIncidents) {
		this.securityIncidents = securityIncidents;
	}
    

	


}