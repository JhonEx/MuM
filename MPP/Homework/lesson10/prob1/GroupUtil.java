package lesson10.prob1;

import java.util.*;

public class GroupUtil {
	public static Group<?> copy(Group<?> group) {
		return copyHelper(group);
	}

	private static <T> Group<T> copyHelper(Group<T> group) {
		return new Group<>(group.getSpecialElement(), group.getElements());
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(0,1,2,3,4);
		Group<Integer> group = new Group<>(0, list);

		System.out.println(group);
		System.out.println(GroupUtil.copy(group));
	}
}
