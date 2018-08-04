//Override method of parent class

class Vehicle {  //Class Vehicle
	public void start() {
		System.out.println("Starting the vehicle"); //Start vehicle
	}
}

//Class Four Wheeler
class FourWheeler extends Vehicle{
	public void start() {
		System.out.println("Starting the four wheeler"); //Start four-wheeler
	}
}

//Test Vehicle
public class VehicleOverride {
	
	public static void main(String[] args) {
		
		Vehicle vehicle=new Vehicle();
		vehicle.start();  //Start vehicle
		
		FourWheeler fourwheeler=new FourWheeler();
		fourwheeler.start();  //Start four-wheeler
	}
}

