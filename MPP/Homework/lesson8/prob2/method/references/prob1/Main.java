package lesson8.prob2.method.references.prob1;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        MyClass cl1 = new MyClass();
        MyClass cl2 = new MyClass();

        Predicate<MyClass> predicate = cl1::myMethod;
        System.out.println(predicate.test(cl2));
    }
}
