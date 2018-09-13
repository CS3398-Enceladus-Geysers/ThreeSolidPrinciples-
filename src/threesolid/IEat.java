//Kristof York
//We broke up the IWorker interface into 2 interfaces to make it easier to implement the Robot class. 
//This follows the interface segregation principle because it allows the the user to apply these attributes
//to the class seperately. Since Robots cannot eat there's no need for them to have the method eat();.
//We also decided to make each interface have it's own file because of the Open-Close principle. 
//This allows us to add extensions to each interface without having to risk messing up the other.
package threesolid;

interface IEat {
	public void eat();
}