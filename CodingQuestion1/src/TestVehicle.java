

import Transportation.Car;
import Transportation.MotorCycle;
import Transportation.Person;
import Transportation.Truck;

public class TestVehicle {
	
	Person personA = new Person();
	Car car = new Car();
	Truck truck = new Truck();
	Person personB = new Person();
	MotorCycle motorcycle = new MotorCycle();

	void transferOwnerShip(){
		personA = personB;
		
	}
	
}
