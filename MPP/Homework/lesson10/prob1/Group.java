package lesson10.prob1;

import java.util.ArrayList;
import java.util.List;

public class Group<T> {
    private T specialElement;
    private List<T> elements = new ArrayList<>();

    public Group(T special, List<T> elements) {
        this.specialElement = special;
        this.elements = elements;
    }

    public List<T> getElements() {
        return elements;
    }

    public T getSpecialElement() {
        return specialElement;
    }

    @Override
    public String toString() {
        return "[special : " + specialElement.toString()
                + ", elements :\n   " + elements.toString() + "]";
    }
}
