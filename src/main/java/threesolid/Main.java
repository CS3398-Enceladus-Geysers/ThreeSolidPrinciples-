package threesolid;

/**
 * This class will serve as the driver class for our threesolid package. We have
 * this class separate because being seperate makes it easy to change the
 * functionality of other parts of the program without affecting this file, thus
 * satisfying the Open-Close principle. Since we have separated this class, the
 * more specialized use case for it is more likely to apply to only one type of
 * user, thus satisfying the Single Responsibility Principle. The Interface
 * Segregation Principle does not apply to this class because Main is not an
 * interface.
 * 
 * @author Peter Wesley Hutcheson
 * @version 1.0
 * @since 1.0
 */
public class Main {
	public static Manager tsManager = new Manager();

	public static void main(String[] args) {
		System.out.format("Starting ... \n");
		Manager bossman = new Manager();
		Robot robo = new Robot();
		SuperWorker chad = new SuperWorker();
		TempWorker pete = new TempWorker();
		Worker alice = new Worker();
		System.out.format("\nManager Methods:\n");
		bossman.setWorker(robo);
		bossman.manage();
		System.out.format("\nRobot Methods:\n");
		robo.work();
		robo.reboot();
		System.out.format("\nSuperWorker Methods:\n");
		chad.eat();
		chad.sick();
		chad.work();
		System.out.format("\nTempWorker Methods:\n");
		pete.eat();
		pete.sick();
		pete.work();
		System.out.format("\nWorker Methods:\n");
		alice.eat();
		alice.sick();
		alice.work();
		System.out.format("\nStopping ... \n");
		System.exit(0);
	}
}