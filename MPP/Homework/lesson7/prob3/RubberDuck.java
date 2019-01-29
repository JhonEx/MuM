package lesson7.labs.prob3;

public class RubberDuck implements Duck {

	@Override
	public void fly() {
		cannotFly();
	}

	@Override
	public  void quack() {
		squeak();
	}
}
