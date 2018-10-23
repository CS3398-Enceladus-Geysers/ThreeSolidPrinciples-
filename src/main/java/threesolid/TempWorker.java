package threesolid;

public class TempWorker extends BaseWorker implements IEat, ISick {
	@Override
	public String work() {
		System.out.format("Working temporarily\n");
		return ("Working temporarily\n");
	}

	@Override
	public void sick() {
		System.out.format("Being sick... temporarily\n");
	}

	@Override
	public void eat() {
		System.out.format("Tempworker eats special temp worker meals.\n");
	}
}