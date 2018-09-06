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
		try {
			System.out.format("Starting ... \n");
		} catch (Exception main_except) {
			main_except.printStackTrace();
		}
		try {
			System.out.format("Stopping ... \n");
		} catch (Exception main_except) {
			main_except.printStackTrace();
		}
		System.exit(0);
	}
}