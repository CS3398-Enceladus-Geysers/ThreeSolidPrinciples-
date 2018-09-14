package threesolid;

public class TempWorker extends BaseWorker implements IEat, ISick {
	@Override
	public void work() {
		System.out.format("Working temporarily\n");
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