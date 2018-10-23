package threesolid;

public class BaseWorker implements IWorkable {

	@Override
	public void work() {
		System.out.format("Working...\n");
	}
}