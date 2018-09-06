package threesolid;

public class Main {
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