package threesolid;

public class BaseWorker implements IWorkable {

	@Override
	public String work() {
		System.out.format("Working...\n");
		return ("Working...\n");
	}
}