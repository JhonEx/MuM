package lesson7.labs.prob3;

public class DecoyDuck implements Duck {
	@Override
	public void quack() { cannotQuack(); }

	@Override
	public void fly() {
		cannotFly();
	}
}
