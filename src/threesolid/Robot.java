// Laura Rice
// We have separated the Robot class so that it has its own java file.  
// As we extend this class, the functions of Robot will differ from those of Worker and Superworker, so 
// creating Robot as a separate class will allow a user to add more functionality to the code without affecting
// Worker or Superworker.  This applies the Single Responsibility principal.  
// We have also applied the Open Close principal by separating the class.  We can add on to the existing code 
// without modifying it.  
// The integration-segregation principal is also used because of our decision to separate the interfaces.  The Robot class
// does require the IFeedable interface so by applying the integration-segragation principal, Robot was
// not forced to implement interfaces they don't use.  

package threesolid;

public class Robot implements IWorkable {

	public void work() {
		//.....only working
	}
}
