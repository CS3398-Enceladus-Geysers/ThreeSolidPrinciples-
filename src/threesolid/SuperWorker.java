
// Maria F Jaramillo
// Open Close Principle = By creating a new class we made it more manageable 
// by creating more classes instead of adding functions.
// Single Responsibility by making sure that only the SuperWorker is the 
// only code to be changed.
// and separating the interface Iworkable and Ifeedable helps only
// assigning the functions that corresponds to each class.
package threesolid;

public class SuperWorker extends BaseWorker implements IFeedable {

	@Override
	public void work() {
		System.out.format("Working Super hard\n");
	}

	public void eat() {
		//.... eating in launch break
	}
}

