package lesson8.prob2.method.references.prob1;

public class MyClass {

    public boolean myMethod(MyClass cl) {
        if (this == cl) {
            return true;
        } else {
            return false;
        }
    }
}
