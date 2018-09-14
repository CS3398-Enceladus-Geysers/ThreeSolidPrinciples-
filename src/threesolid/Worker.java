
// We have separated the Worker class so that it has its own java file.  
// As we extend this class, the functions of Worker will differ from those of Robot and Superworker, so 
// creating Worker as a separate class will allow a user to add more functionality to the code without affecting
// Robot or Superworker.  This applies the Single Responsibility principal.  
// We have also applied the Open Close principal by separating the class.  We can add on to the existing code 
// without modifying it.  


package threesolid;

public class Worker extends BaseWorker implements  IFeedable {

	public void eat() {
		//.... eating in launch break
	}
}
