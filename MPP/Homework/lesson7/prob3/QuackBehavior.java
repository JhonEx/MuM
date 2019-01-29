package lesson7.labs.prob3;

public interface QuackBehavior {
	default void quack() { System.out.println("  quacking"); }
	default void cannotQuack() { System.out.println("  cannot quack"); }
	default void squeak() { System.out.println("  squeaking"); }
}
