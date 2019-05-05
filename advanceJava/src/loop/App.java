package loop;

import java.util.ArrayList;
import java.util.List;

class Vehicle{
	private int vehicleID;

	public Vehicle(int vehicleID) {
		super();
		this.vehicleID = vehicleID;
	}

	public int getVehicleID() {
		return vehicleID;
	}

	public void setVehicleID(int vehicleID) {
		this.vehicleID = vehicleID;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleID=" + vehicleID + "]";
	}
	
}
  class car extends Vehicle{
	private String model;

	

	public car(int vehicleID, String model) {
		super(vehicleID);
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
  }

public class App {
  public static void main(String[] args) {
	List<Vehicle> list = new ArrayList<Vehicle>();
	list.add(new Vehicle(10));
	list.add(new Vehicle(20));
	list.add(new Vehicle(30));
	list.add(new Vehicle(40));
	printList(list);
 }
  public static void printList(List<?> print) {
	  for(Object liVehicle: print) {
		  System.out.println(liVehicle);
	  }
  }
}
