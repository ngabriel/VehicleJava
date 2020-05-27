package com.qa.vehicle;

public abstract class Vehicle {
	
	
	public abstract void drive();
	
	
	private String colour;
	private String noise;
	private int noOftyres;

	private int ID;
	private static int count;
	private int noOfDoors;
	private int noOfWindows;
	private int nofPassengers;
	
	private double engineSize;
	
	public Vehicle(int noOftyres, String colour) {
		ID++;
		this.noOftyres = noOftyres;
		this.colour = colour;
		
		
		
	}
	
	public void beep() {
		System.out.println(noise);
	}

	public int getNoOftyres() {
		return noOftyres;
	}

	public void setNoOftyres(int noOftyres) {
		this.noOftyres = noOftyres;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getNoOfDoors() {
		return noOfDoors;
	}

	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}

	public int getNoOfWindows() {
		return noOfWindows;
	}

	public void setNoOfWindows(int noOfWindows) {
		this.noOfWindows = noOfWindows;
	}

	public int getNofPassengers() {
		return nofPassengers;
	}

	public void setNofPassengers(int nofPassengers) {
		this.nofPassengers = nofPassengers;
	}

	public double getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(double engineSize) {
		this.engineSize = engineSize;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Vehicle.count = count;
	}
	
	
	

}
