package lesson7.labs.prob3;

public interface Duck extends FlyBehavior, QuackBehavior {
	default void swim() {
		System.out.println("  swimming");
	}
	default void display() {
		System.out.println("  displaying");
	}
}
