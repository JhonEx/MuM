package lesson7.labs.prob3;

public interface FlyBehavior {
	default void fly() { System.out.println("  fly with wings"); }
	default void cannotFly() { System.out.println("  cannot fly"); }
}
