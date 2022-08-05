package com.caresoft.clinicapp;

public class User {
    //this is called a member variable
    protected Integer id;
    //this is called a member variable
    protected int pin;
	
   	// Implement a constructor that takes an ID

    public User(Integer id) {
		this.id = id;
	}
// String takeID = System.console().readLine();
    
    // TO DO: Getters and setters
    
    public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
    
    
}
